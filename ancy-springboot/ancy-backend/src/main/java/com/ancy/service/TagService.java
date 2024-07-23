package com.ancy.service;


import com.ancy.pojo.dto.TagDTO;
import com.ancy.pojo.entity.Tag;
import com.ancy.pojo.vo.TagVO;

import java.util.List;

public interface TagService {


    void addTag(TagDTO tagDTO);

    Tag selectById(Integer tagId);

    List<TagVO> list();
}
