package com.ancy.controller.user;

import com.ancy.pojo.dto.articleDTO;
import com.ancy.pojo.result.Result;
import com.ancy.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("userArticleController")
@RequestMapping("/articles")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @GetMapping
    public Result selectArticles(){
        System.out.println("selectArticles");
        List<articleDTO> articleDTOList = articleService.userSelect();
        return Result.success(articleDTOList);
    }



}
