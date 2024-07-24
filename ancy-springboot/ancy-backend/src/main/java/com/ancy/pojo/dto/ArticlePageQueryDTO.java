package com.ancy.pojo.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ArticlePageQueryDTO {
    @NotBlank
    private Integer current;
    @NotBlank
    private Integer size;

    private String title;

    private Integer categoryId;

    private Integer status;

    private Integer isDelete;

    private Integer tagId;
}
