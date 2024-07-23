package com.ancy.service;

import com.ancy.pojo.dto.ArticleDTO;
import com.ancy.pojo.dto.ArticlePageQueryDTO;
import com.ancy.pojo.result.PageResult;
import com.ancy.pojo.vo.ArticleCardVO;

public interface ArticleService {
    void addArticle(ArticleDTO articleDTO);

    PageResult<ArticleCardVO> userSelect(ArticlePageQueryDTO articlePageQueryDTO);

}
