package com.alukaduolin.shangguigu.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@ComponentScan
@MapperScan(basePackages = "com.alukaduolin.shangguigu.user.mapper")
public class ShangguiguUserManageApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShangguiguUserManageApplication.class,args);//这里可能出问题,视频太模糊
    }
}
