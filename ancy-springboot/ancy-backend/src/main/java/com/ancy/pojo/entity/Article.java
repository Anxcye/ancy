package com.ancy.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_article")
public class Article {
    private Integer id;
    private String title;
    private String articleCover;
    private Integer categoryId;
    private String content;
    private Integer isDelete;
    private Integer status;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
