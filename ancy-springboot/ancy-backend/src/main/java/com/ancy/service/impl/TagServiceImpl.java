package com.ancy.service.impl;

import com.ancy.mapper.TagMapper;
import com.ancy.pojo.dto.TagDTO;
import com.ancy.pojo.entity.Tag;
import com.ancy.pojo.vo.TagVO;
import com.ancy.service.TagService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Slf4j
@Service
public class TagServiceImpl implements TagService {

    @Resource
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

    @Override
    public List<TagVO> list() {
        List<Tag> tags = tagMapper.selectList(null);
        return tags.stream().map(tag -> {
            TagVO tagVO = new TagVO();
            BeanUtils.copyProperties(tag, tagVO);
            return tagVO;
        }).collect(Collectors.toList());
    }
}
