package com.ancy.mapper;

import com.ancy.pojo.entity.Article;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface articleMapper {
    @Insert("insert into t_article (title, content, is_delete, creat_time, update_time) values " +
            "(#{title}, #{content}, #{isDelete}, #{creatTime}, #{updateTime})")
    public void insertArticle(Article article);

    @Select("select id, title from t_article where is_delete = 0")
    public List<Article> selectArticleNotDeleted();
}