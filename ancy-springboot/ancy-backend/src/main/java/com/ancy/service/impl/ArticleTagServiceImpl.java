package com.ancy.service.impl;

import com.ancy.mapper.ArticleTagMapper;
import com.ancy.pojo.entity.ArticleTag;
import com.ancy.pojo.entity.Tag;
import com.ancy.pojo.vo.TagVO;
import com.ancy.service.ArticleTagService;
import com.ancy.service.TagService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class ArticleTagServiceImpl implements ArticleTagService {

    @Resource
    private ArticleTagMapper articleTagMapper;

    @Resource
    private TagService tagService;


    @Override
    public void addArticleTag(List<ArticleTag> articleTags) {
        articleTagMapper.insert(articleTags);
    }

    @Override
    public List<TagVO> selectTagsByArticleId(Integer id) {
        List<ArticleTag> articleTags = articleTagMapper.selectTagsByArticleId(id);
        return articleTags.stream().map(articleTag -> {
            Integer tagId = articleTag.getTagId();
            Tag tag = tagService.selectById(tagId);
            TagVO tagVO = new TagVO();
            BeanUtils.copyProperties(tag, tagVO);
            return tagVO;
        }).collect(Collectors.toList());
    }

    @Override
    public List<Integer> selectArticleIdsByTagId(Integer tagId) {
        List<ArticleTag> articleTags = articleTagMapper.selectByTagId(tagId);
        return articleTags.stream().map(ArticleTag::getArticleId).collect(Collectors.toList());
    }
}
