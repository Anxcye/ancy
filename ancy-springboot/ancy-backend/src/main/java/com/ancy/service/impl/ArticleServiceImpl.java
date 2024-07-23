package com.ancy.service.impl;

import com.ancy.pojo.dto.articleDTO;
import com.ancy.pojo.entity.Article;
import com.ancy.service.ArticleService;
import com.ancy.mapper.articleMapper;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class ArticleServiceImpl implements ArticleService {

    private static final Logger log = LoggerFactory.getLogger(ArticleServiceImpl.class);
    @Autowired
    private articleMapper articleMapper;

    @Override
    public void addArticle(articleDTO articleDTO) {
        Article article = new Article();
        BeanUtils.copyProperties(articleDTO, article);
        log.info(article.toString());
        log.info("hello");



        articleMapper.insert(article);
    }

    @Override
    public List<articleDTO> userSelect() {
////        List<Article> articles = articleMapper.selectArticleNotDeleted();
//
//        return articles.stream().map(article -> {
//            articleDTO articleDTO = new articleDTO();
//            BeanUtils.copyProperties(article, articleDTO);
//            return articleDTO;
//        }).collect(Collectors.toList());
        return null;
    }
}
