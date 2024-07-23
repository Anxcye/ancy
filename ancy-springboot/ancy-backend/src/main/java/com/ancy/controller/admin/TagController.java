package com.ancy.controller.admin;

import com.ancy.pojo.dto.TagDTO;
import com.ancy.pojo.result.Result;
import com.ancy.service.TagService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("adminTagController")
@RequestMapping("/admin/tags")
@Api(tags = "标签管理")
public class TagController {
    @Autowired
    private TagService tagService;

    @ApiOperation("添加标签")
    @PostMapping
    public Result<Void> addTags(TagDTO tagDTO) {
       tagService.addTag(tagDTO);
       return Result.success();
    }
}
