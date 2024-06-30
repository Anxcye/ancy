package com.ancy.pojo.dto;

import lombok.Data;

@Data
public class articleDTO {
    private Integer id;
    private String title;
    private String content;
    private Integer isDelete;
}
