package com.ancy.controller.admin;

import com.ancy.pojo.result.Result;
import com.ancy.pojo.dto.articleDTO;
import com.ancy.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("adminArticleController")
@RequestMapping("/admin/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping
    public Result addArticle(@RequestBody articleDTO articleDTO){
        articleService.addArticle(articleDTO);
        return Result.success();
    }

}
