package com.youxia;

import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfig
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication application=new SpringApplication();
        application.run(ConsumerApplication.class,args);
    }
}
