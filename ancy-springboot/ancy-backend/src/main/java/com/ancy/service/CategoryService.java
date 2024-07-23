package com.ancy.service;


import com.ancy.pojo.dto.CategoryDTO;
import com.ancy.pojo.vo.CategoryVO;

import java.util.List;

public interface CategoryService {


    void addCategory(CategoryDTO categoryDTO);

    CategoryVO selectCategoryById(Integer id);

    List<CategoryVO> list();
}
