package com.ancy.controller.user;

import com.ancy.pojo.result.Result;
import com.ancy.pojo.vo.CategoryVO;
import com.ancy.service.CategoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("usewrCategoryController")
@RequestMapping("/categories")
@Tag(name = "分类管理")
public class CategoryController {
    @Resource
    private CategoryService categoryService;

    @GetMapping
    @Operation(summary = "获取分类列表")
    public Result<List<CategoryVO>> list() {
        List<CategoryVO> categoryVOList = categoryService.list();
        return Result.success(categoryVOList);
    }

}
