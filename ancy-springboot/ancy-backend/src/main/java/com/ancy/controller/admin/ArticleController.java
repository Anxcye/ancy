package com.ancy.controller.admin;

import com.ancy.pojo.dto.ArticlePageQueryDTO;
import com.ancy.pojo.result.PageResult;
import com.ancy.pojo.result.Result;
import com.ancy.pojo.dto.ArticleDTO;
import com.ancy.pojo.vo.ArticleCardVO;
import com.ancy.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("adminArticleController")
@RequestMapping("/admin/articles")
@Api(tags = "文章管理")
@Slf4j
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping
    @ApiOperation("添加文章")
    public Result<Void> addArticle(@RequestBody ArticleDTO articleDTO){
        articleService.addArticle(articleDTO);
        return Result.success();
    }

    @GetMapping("/list")
    @ApiOperation("获取文章列表")
    public Result<PageResult<ArticleCardVO>> listArticle(ArticlePageQueryDTO articlePageQueryDTO){
        return Result.success(articleService.listArticleAdmin(articlePageQueryDTO));
    }

}
