package com.ancy.pojo.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class ArticleDTO {

    @NotBlank(message = "标题不能为空")
    private String title;

    private String articleCover;

    private Integer categoryId;

    private String summary;

    @NotBlank(message = "内容不能为空")
    private String content;

    private List<Integer> tagIds;

    private Integer isDelete;

    private Integer status;

}
