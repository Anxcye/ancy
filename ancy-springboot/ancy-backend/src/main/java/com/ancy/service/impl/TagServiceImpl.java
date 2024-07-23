package com.ancy.service.impl;

import com.ancy.mapper.TagMapper;
import com.ancy.pojo.dto.TagDTO;
import com.ancy.pojo.entity.Tag;
import com.ancy.service.TagService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagMapper tagMapper;
    @Override
    public void addTag(TagDTO tagDTO) {
        Tag tag = new Tag();
        BeanUtils.copyProperties(tagDTO, tag);
        tagMapper.insert(tag);
    }

    @Override
    public Tag selectById(Integer tagId) {
        return tagMapper.selectById(tagId);
    }
}
