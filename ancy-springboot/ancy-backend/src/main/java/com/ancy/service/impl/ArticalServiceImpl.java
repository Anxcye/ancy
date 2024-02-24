package com.ancy.service.impl;

import com.ancy.pojo.dto.articalDTO;
import com.ancy.pojo.entity.Artical;
import com.ancy.service.ArticalService;
import com.ancy.mapper.articalMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ArticalServiceImpl implements ArticalService {

    @Autowired
    private articalMapper articalMapper;

    @Override
    public void addArtical(articalDTO articalDTO) {
        Artical artical = new Artical();
        BeanUtils.copyProperties(articalDTO, artical);

        artical.setCreatTime(LocalDateTime.now());
        artical.setUpdateTime(LocalDateTime.now());
        artical.setIsDelete(0);
        articalMapper.insertArtical(artical);

    }
}
