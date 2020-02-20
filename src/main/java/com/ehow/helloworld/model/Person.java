package com.ehow.helloworld.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
* @Description: Person
* @Author: yihao
* @Date: 2020/2/20
*/
@Data
@Component
//@ConfigurationProperties(prefix = "person")
//PropertySource不能加载*.yml
@PropertySource(value = {"classpath:person.properties"})
public class Person {
    @Value("${person.name}")
    private String name ;
    private String age ;

}
