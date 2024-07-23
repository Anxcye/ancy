package com.ancy.service.impl;

import com.ancy.pojo.dto.ArticleDTO;
import com.ancy.pojo.dto.ArticlePageQueryDTO;
import com.ancy.pojo.entity.Article;
import com.ancy.pojo.entity.ArticleTag;
import com.ancy.pojo.result.PageResult;
import com.ancy.pojo.vo.ArticleCardVO;
import com.ancy.pojo.vo.CategoryVO;
import com.ancy.pojo.vo.TagVO;
import com.ancy.service.ArticleService;
import com.ancy.mapper.ArticleMapper;
import com.ancy.service.ArticleTagService;
import com.ancy.service.CategoryService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
    private ArticleTagService articleTagService;

    @Autowired
    private CategoryService categoryService;

    @Override
    public void addArticle(ArticleDTO articleDTO) {
        Article article = new Article();
        BeanUtils.copyProperties(articleDTO, article);
        articleMapper.insert(article);
        List<Integer> tagIds = articleDTO.getTagIds();
        log.info(String.valueOf(tagIds));

        // add article tag
        List<ArticleTag> articleTags = tagIds.stream().map(tagId -> {
            ArticleTag articleTag = new ArticleTag();
            articleTag.setArticleId(article.getId());
            articleTag.setTagId(tagId);
            return articleTag;
        }).collect(Collectors.toList());

        articleTagService.addArticleTag(articleTags);
    }

    @Override
    public PageResult<ArticleCardVO> userSelect(ArticlePageQueryDTO articlePageQueryDTO) {
        Page<Article> articlePage = Page.of(articlePageQueryDTO.getCurrent(), articlePageQueryDTO.getSize());
        articlePage.addOrder(new OrderItem().setColumn("create_time").setAsc(false));
        LambdaQueryWrapper<Article> queryWrapper = new LambdaQueryWrapper<Article>()
                .eq(Article::getIsDelete, 0)
                .eq(Article::getStatus, 0);

        if (articlePageQueryDTO.getCategoryId() != null)
            queryWrapper.eq(Article::getCategoryId, articlePageQueryDTO.getCategoryId());

        if (articlePageQueryDTO.getTagId() != null){
            List<Integer> articleIds = articleTagService.selectArticleIdsByTagId(articlePageQueryDTO.getTagId());
            queryWrapper.in(Article::getId, articleIds);
        }


        articleMapper.selectPage(articlePage, queryWrapper);
        List<Article> records = articlePage.getRecords();

        List<ArticleCardVO> collect = records.stream().map(article -> {
            ArticleCardVO articleCardVO = new ArticleCardVO();
            BeanUtils.copyProperties(article, articleCardVO);
            // category
            CategoryVO category = categoryService.selectCategoryById(article.getCategoryId());
            articleCardVO.setCategory(category);
            // tags
            List<TagVO> tagIds = articleTagService.selectTagsByArticleId(article.getId());
            articleCardVO.setTags(tagIds);
            return articleCardVO;
        }).collect(Collectors.toList());

        return new PageResult<>(records.size(), collect);

    }
}
