package com.ancy.controller.user;

import com.ancy.pojo.dto.ArticleDTO;
import com.ancy.pojo.dto.ArticlePageQueryDTO;
import com.ancy.pojo.result.PageResult;
import com.ancy.pojo.result.Result;
import com.ancy.pojo.vo.ArticleCardVO;
import com.ancy.pojo.vo.ArticleVO;
import com.ancy.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("userArticleController")
@RequestMapping("/articles")
@Api(tags = "用户文章")
@Slf4j
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @ApiOperation("获取所有文章")
    @GetMapping("/list")
    public Result<PageResult<ArticleCardVO>> selectArticles(ArticlePageQueryDTO articlePageQueryDTO) {
        return Result.success(articleService.userSelect(articlePageQueryDTO));
    }

    @ApiOperation("通过文章id获取文章")
    @GetMapping("/{articleId}")
    public Result<ArticleVO> selectArticleById(@PathVariable String articleId) {
        return Result.success(articleService.selectArticleById(articleId));
    }


//    public Result


}
