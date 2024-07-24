package com.ancy.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleVO {

        private Integer id;

        private String title;

        private String articleCover;

        private CategoryVO category;

        private String content;

        private String summary;

        private List<TagVO> tags;

        private LocalDateTime createTime;

        private LocalDateTime updateTime;
}
