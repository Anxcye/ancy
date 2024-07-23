package com.ancy.pojo.dto;

import lombok.Data;

@Data
public class ArticlePageQueryDTO {

        private Integer current;

        private Integer size;

        private String title;

        private Integer categoryId;

        private Integer status;

        private Integer isDelete;

        private Integer tagId;
}
