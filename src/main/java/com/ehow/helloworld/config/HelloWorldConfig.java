package com.ehow.helloworld.config;

import com.ehow.helloworld.service.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
* @Description: 配置类，使用 @Bean给容器添加组件，id为@Bean标注的方法名
* @Author: yihao
* @Date: 2020/2/20
*/
@Configuration
public class HelloWorldConfig {
    @Bean
    public HelloWorldService helloWorldService1(){
        System.out.println("add success!");
        return new HelloWorldService();
    }
}
