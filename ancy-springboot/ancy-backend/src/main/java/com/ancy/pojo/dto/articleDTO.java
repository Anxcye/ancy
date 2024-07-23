package com.ancy.pojo.dto;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class articleDTO {

    @NotBlank(message = "标题不能为空")
    private String title;

    private String articleCover;

    private Integer categoryId;

    private String summary;

    @NotBlank(message = "内容不能为空")
    private String content;

    private List<Integer> tagId;

    private Integer isDelete;

    private Integer status;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
