package com.ancy.mapper;

import com.ancy.pojo.entity.ArticleTag;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ArticleTagMapper extends BaseMapper<ArticleTag> {
    @Select("select * from t_article_tag where article_id = #{articleId} ")
    List<ArticleTag> selectTagsByArticleId(@Param("articleId") Integer articleId);

    @Select("select * from t_article_tag where tag_id = #{tagId}")
    List<ArticleTag> selectByTagId(Integer tagId);
}