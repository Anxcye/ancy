package com.ancy.service;

import com.ancy.pojo.dto.articleDTO;

import java.util.List;

public interface ArticleService {
    void addArticle(articleDTO articleDTO);

    List<articleDTO> userSelect();

}
