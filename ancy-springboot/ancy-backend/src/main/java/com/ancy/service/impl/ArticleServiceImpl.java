package com.ancy.service.impl;

import com.ancy.pojo.dto.articleDTO;
import com.ancy.pojo.entity.Article;
import com.ancy.service.ArticleService;
import com.ancy.mapper.articleMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private articleMapper articleMapper;

    @Override
    public void addArticle(articleDTO articleDTO) {
        Article article = new Article();
        BeanUtils.copyProperties(articleDTO, article);

        article.setCreatTime(LocalDateTime.now());
        article.setUpdateTime(LocalDateTime.now());
        article.setIsDelete(0);
        articleMapper.insertArticle(article);

    }

    @Override
    public List<articleDTO> userSelect() {
        List<Article> articles = articleMapper.selectArticleNotDeleted();

        return articles.stream().map(article -> {
            articleDTO articleDTO = new articleDTO();
            BeanUtils.copyProperties(article, articleDTO);
            return articleDTO;
        }).collect(Collectors.toList());
    }
}
