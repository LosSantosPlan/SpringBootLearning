package com.ehow.helloworld.controller;

import com.ehow.helloworld.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
* @Description: HelloController
* @Author: yihao
* @Date: 2020/2/17
*/
@RestController
public class HelloController {
    @Value("${name}")
    private String name ;
    @Value("${test}")
    private String test ;
    @RequestMapping("/hello")
    public String helloWorld(){
        return name;
    }
}
