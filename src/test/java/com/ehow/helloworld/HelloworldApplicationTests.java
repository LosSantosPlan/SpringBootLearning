package com.ehow.helloworld;

import com.ehow.helloworld.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.beans.Transient;

@SpringBootTest
class HelloworldApplicationTests {
    @Autowired
    private Person person;
    @Autowired
    private ApplicationContext ioc;

    @Test
    void contextLoads() {
        System.out.println("hello");
    }
    /**
     * @Description: 测试全局变量配置文件
     * @param :
     * @auther: yihao
     * @date: 2020/2/20 21:05
     */
    @Test
    void hello (){
        System.out.println(person.toString());
    }
    /**
     * @Description: 测试@Bean 配置类
     * @param :
     * @auther: yihao
     * @date: 2020/2/20 21:05
     */
    @Test
    void checkService(){
        boolean isContains = ioc.containsBean("helloWorldService1");
        System.out.println(isContains);
    }
}
