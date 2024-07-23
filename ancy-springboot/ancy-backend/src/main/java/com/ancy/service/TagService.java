package com.ancy.service;


import com.ancy.pojo.dto.TagDTO;
import com.ancy.pojo.entity.Tag;

public interface TagService {


    void addTag(TagDTO tagDTO);

    Tag selectById(Integer tagId);
}
