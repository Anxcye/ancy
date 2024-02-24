package com.ancy.controller.admin;

import com.ancy.pojo.result.Result;
import com.ancy.pojo.dto.articalDTO;
import com.ancy.service.ArticalService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/artical")
public class ArticalController {

    @Autowired
    private ArticalService articalService;

    @PostMapping
    public Result addArtical(@RequestBody articalDTO articalDTO){
        articalService.addArtical(articalDTO);
        return Result.success();
    }

}
