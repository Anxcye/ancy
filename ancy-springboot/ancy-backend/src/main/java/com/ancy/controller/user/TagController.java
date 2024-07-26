package com.ancy.controller.user;

import com.ancy.pojo.result.Result;
import com.ancy.pojo.vo.TagVO;
import com.ancy.service.TagService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tags")
@Tag(name = "用户标签")
public class TagController {

    @Resource
    private TagService tagService;

    @GetMapping
    @Operation(summary = "获取标签列表")
    public Result<List<TagVO>> list() {
        List<TagVO> tagVOList = tagService.list();
        return Result.success(tagVOList);
    }
}
