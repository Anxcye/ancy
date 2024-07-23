package com.ancy.controller.user;

import com.ancy.pojo.result.Result;
import com.ancy.pojo.vo.TagVO;
import com.ancy.service.TagService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tags")
@Api(tags = "用户标签")
public class TagController {

    @Autowired
    private TagService tagService;

    @GetMapping
    @ApiOperation("获取标签列表")
    public Result<List<TagVO>> list() {
        List<TagVO> tagVOList = tagService.list();
        return Result.success(tagVOList);
    }
}
