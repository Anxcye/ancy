package com.ancy.mapper;

import com.ancy.pojo.entity.Article;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface articleMapper extends BaseMapper<Article> {
    @Insert("insert into t_article (title, content, is_delete, create_time, update_time) values " +
            "(#{title}, #{content}, #{isDelete}, #{createTime}, #{updateTime})")
    void insertArticle(Article article);

    @Select("select id, title from t_article where is_delete = 0")
    List<Article> selectArticleNotDeleted();

}