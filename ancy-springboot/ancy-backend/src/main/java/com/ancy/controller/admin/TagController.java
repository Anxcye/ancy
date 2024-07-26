package com.ancy.controller.admin;

import com.ancy.pojo.dto.TagDTO;
import com.ancy.pojo.result.Result;
import com.ancy.pojo.vo.TagVO;
import com.ancy.service.TagService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("adminTagController")
@RequestMapping("/admin/tags")
@Tag(name = "标签管理")
public class TagController {
    @Resource
    private TagService tagService;

    @Operation(summary = "添加标签")
    @PostMapping
    public Result<Void> addTags(TagDTO tagDTO) {
       tagService.addTag(tagDTO);
       return Result.success();
    }

    @GetMapping
    @Operation(summary = "获取标签列表")
    public Result<List<TagVO>> list() {
        List<TagVO> tagVOList = tagService.list();
        return Result.success(tagVOList);
    }
}
