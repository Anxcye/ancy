package com.ancy.controller.user;

import com.ancy.pojo.dto.articleDTO;
import com.ancy.pojo.result.Result;
import com.ancy.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("userArticleController")
@RequestMapping("/articles")
@Api(tags = "用户文章管理")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @ApiOperation("获取所有文章")
    @GetMapping
    public Result<List<articleDTO>> selectArticles() {
        List<articleDTO> articleDTOList = articleService.userSelect();
        return Result.success(articleDTOList);
    }

//    public Result


}
