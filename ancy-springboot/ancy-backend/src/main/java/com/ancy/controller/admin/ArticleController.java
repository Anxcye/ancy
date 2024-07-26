package com.ancy.controller.admin;

import com.ancy.pojo.dto.ArticlePageQueryDTO;
import com.ancy.pojo.result.PageResult;
import com.ancy.pojo.result.Result;
import com.ancy.pojo.dto.ArticleDTO;
import com.ancy.pojo.vo.ArticleCardVO;
import com.ancy.service.ArticleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;


@RestController("adminArticleController")
@RequestMapping("/admin/articles")
@Tag(name = "文章管理")
@Slf4j
public class ArticleController {

    @Resource
    private ArticleService articleService;

    @PostMapping
    @Operation(summary = "添加文章")
    public Result<Void> addArticle(@RequestBody ArticleDTO articleDTO) {
        articleService.addArticle(articleDTO);
        return Result.success();
    }

    @GetMapping("/list")
    @Operation(summary = "获取文章列表")

    public Result<PageResult<ArticleCardVO>> listArticle(@ParameterObject ArticlePageQueryDTO articlePageQueryDTO) {
        return Result.success(articleService.listArticleAdmin(articlePageQueryDTO));
    }

}
