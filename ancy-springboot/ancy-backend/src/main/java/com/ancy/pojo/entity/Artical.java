package com.ancy.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Artical {
    private Integer id;
    private String title;
    private String content;
    private Integer isDelete;
    private LocalDateTime creatTime;
    private LocalDateTime updateTime;
}
