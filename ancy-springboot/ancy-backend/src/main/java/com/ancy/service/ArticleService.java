package com.ancy.service;

import com.ancy.pojo.dto.ArticleDTO;
import com.ancy.pojo.dto.ArticlePageQueryDTO;
import com.ancy.pojo.result.PageResult;
import com.ancy.pojo.vo.ArticleCardVO;
import com.ancy.pojo.vo.ArticleVO;

import java.util.List;

public interface ArticleService {
    void addArticle(ArticleDTO articleDTO);

    PageResult<ArticleCardVO> userSelect(ArticlePageQueryDTO articlePageQueryDTO);

    ArticleVO selectArticleById(String articleId);

    PageResult<ArticleCardVO> listArticleAdmin(ArticlePageQueryDTO articlePageQueryDTO);
}
