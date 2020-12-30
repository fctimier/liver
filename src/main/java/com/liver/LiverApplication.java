package com.liver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.liver.mapper")
public class LiverApplication {

    public static void main(String[] args) {

        SpringApplication bootApplication = new SpringApplication(LiverApplication.class);
        // 关闭BANNER
        bootApplication.setBannerMode(Banner.Mode.OFF);

        bootApplication.run();

        // SpringApplication.run(LiverApplication.class, args);

    }

}
