package com.ancy.service;


import com.ancy.pojo.dto.CategoryDTO;
import com.ancy.pojo.vo.CategoryVO;

public interface CategoryService {


    void addCategory(CategoryDTO categoryDTO);

    CategoryVO selectCategoryById(Integer id);

}
