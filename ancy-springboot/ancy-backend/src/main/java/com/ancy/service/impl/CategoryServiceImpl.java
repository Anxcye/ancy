package com.ancy.service.impl;

import com.ancy.mapper.CategoryMapper;
import com.ancy.pojo.dto.CategoryDTO;
import com.ancy.pojo.entity.Category;
import com.ancy.pojo.vo.CategoryVO;
import com.ancy.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Slf4j
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public void addCategory(CategoryDTO categoryDTO) {
        Category category = new Category();
        BeanUtils.copyProperties(categoryDTO, category);
        categoryMapper.insert(category);
    }

    @Override
    public CategoryVO selectCategoryById(Integer id) {
        Category category = categoryMapper.selectById(id);

        CategoryVO categoryVO = new CategoryVO();
        BeanUtils.copyProperties(category, categoryVO);

        return categoryVO;
    }

    @Override
    public List<CategoryVO> list() {
        List<Category> categories = categoryMapper.selectList(null);
        return categories.stream().map(category -> {
            CategoryVO categoryVO = new CategoryVO();
            BeanUtils.copyProperties(category, categoryVO);
            return categoryVO;
        }).collect(Collectors.toList());
    }


}
