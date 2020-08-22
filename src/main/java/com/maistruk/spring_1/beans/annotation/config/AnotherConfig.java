package com.maistruk.spring_1.beans.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.maistruk.spring_1.beans.HelloWorld;
import com.maistruk.spring_1.beans.annotation.BeanBar;
import com.maistruk.spring_1.beans.annotation.BeanFoo;

@Configuration
public class AnotherConfig {
    
    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }
}
