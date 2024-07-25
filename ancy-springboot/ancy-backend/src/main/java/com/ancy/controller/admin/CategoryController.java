package com.ancy.controller.admin;

import com.ancy.pojo.dto.CategoryDTO;
import com.ancy.pojo.result.Result;
import com.ancy.pojo.vo.CategoryVO;
import com.ancy.service.CategoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("adminCategoryController")
@RequestMapping("/admin/categories")
@Tag(name = "分类管理")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @Operation(summary = "添加分类")
    @PostMapping
    public Result<Void> addCategory(CategoryDTO categoryDTO) {
        categoryService.addCategory(categoryDTO);
       return Result.success();
    }

    @GetMapping
    @Operation(summary = "获取分类列表")
    public Result<List<CategoryVO>> list() {
        List<CategoryVO> categoryVOList = categoryService.list();
        return Result.success(categoryVOList);
    }
}
