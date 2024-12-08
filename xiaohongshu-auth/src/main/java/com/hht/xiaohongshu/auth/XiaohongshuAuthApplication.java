package com.hht.xiaohongshu.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hht.xiaohongshu.auth.domain.mapper")
public class XiaohongshuAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaohongshuAuthApplication.class, args);
    }

}
