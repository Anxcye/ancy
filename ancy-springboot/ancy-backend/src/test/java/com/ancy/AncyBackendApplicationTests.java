package com.ancy;

import com.ancy.pojo.entity.Article;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
class AncyBackendApplicationTests {

    @Autowired
    private com.ancy.mapper.articleMapper articleMapper;

    @Test
    void testSelect() {
        log.info("测试类加载成功");
        List<Article> articles = articleMapper.selectList(null);
        articles.forEach(System.out::println);
    }

}
