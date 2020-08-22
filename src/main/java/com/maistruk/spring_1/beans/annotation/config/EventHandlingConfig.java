package com.maistruk.spring_1.beans.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.maistruk.spring_1.beans.HelloWorld;
import com.maistruk.spring_1.beans.annotation.*;

@Configuration
public class EventHandlingConfig {
    
    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }
    
    @Bean
    public CStopEventHandler cStopEventHandler() {
        return new CStopEventHandler();
    }
    
    @Bean
    public CStartEventHandler cStartEventHandler() {
        return new CStartEventHandler();
    }
    
    @Bean
    public CustomEventPublisher customEventPublisher() {
        return new CustomEventPublisher();
    }
    
    @Bean
    public CustomEventHandler CustomEventHandler() {
        return new CustomEventHandler();
    }

}
