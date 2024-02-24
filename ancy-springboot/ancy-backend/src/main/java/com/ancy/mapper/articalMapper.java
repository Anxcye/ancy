package com.ancy.mapper;

import com.ancy.pojo.entity.Artical;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface articalMapper {
    @Insert("insert into t_artical (title, content, is_delete, creat_time, update_time) values " +
            "(#{title}, #{content}, #{isDelete}, #{creatTime}, #{updateTime})")
    public void insertArtical(Artical artical);

}