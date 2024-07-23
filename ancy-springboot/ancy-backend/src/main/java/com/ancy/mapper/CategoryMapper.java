package com.ancy.mapper;

import com.ancy.pojo.entity.Category;
import com.ancy.pojo.entity.Tag;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}