package com.ancy.controller.admin;

import com.ancy.pojo.dto.CategoryDTO;
import com.ancy.pojo.result.Result;
import com.ancy.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("adminCategoryController")
@RequestMapping("/admin/categories")
@Api(tags = "分类管理")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @ApiOperation("添加分类")
    @PostMapping
    public Result<Void> addCategory(CategoryDTO categoryDTO) {
        categoryService.addCategory(categoryDTO);
       return Result.success();
    }
}
