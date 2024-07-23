package com.ancy.service;

import com.ancy.pojo.entity.ArticleTag;
import com.ancy.pojo.vo.TagVO;

import java.util.List;

public interface ArticleTagService {


    void addArticleTag(List<ArticleTag> articleTags);

    List<TagVO> selectTagsByArticleId(Integer id);

    List<Integer> selectArticleIdsByTagId(Integer tagId);
}
