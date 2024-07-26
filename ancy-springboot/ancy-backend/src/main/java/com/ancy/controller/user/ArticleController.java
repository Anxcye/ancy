package com.ancy.controller.user;

import com.ancy.pojo.dto.ArticlePageQueryDTO;
import com.ancy.pojo.result.PageResult;
import com.ancy.pojo.result.Result;
import com.ancy.pojo.vo.ArticleCardVO;
import com.ancy.pojo.vo.ArticleVO;
import com.ancy.service.ArticleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("userArticleController")
@RequestMapping("/articles")
@Tag(name = "用户文章")
@Slf4j
public class ArticleController {
    @Resource
    private ArticleService articleService;

    @Operation(summary = "获取所有文章")
    @GetMapping("/list")
    public Result<PageResult<ArticleCardVO>> selectArticles(@ParameterObject ArticlePageQueryDTO articlePageQueryDTO) {
        return Result.success(articleService.userSelect(articlePageQueryDTO));
    }

    @Operation(summary = "通过文章id获取文章")
    @GetMapping("/{articleId}")
    public Result<ArticleVO> selectArticleById(@PathVariable String articleId) {
        return Result.success(articleService.selectArticleById(articleId));
    }


//    public Result


}
