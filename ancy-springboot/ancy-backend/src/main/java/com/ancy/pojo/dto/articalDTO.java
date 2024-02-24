package com.ancy.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
public class articalDTO {
    private Integer id;
    private String title;
    private String content;
    private Integer isDelete;
}
