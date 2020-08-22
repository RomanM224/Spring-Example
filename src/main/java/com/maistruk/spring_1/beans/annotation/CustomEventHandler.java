package com.maistruk.spring_1.beans.annotation;

import org.springframework.context.ApplicationListener;

public class CustomEventHandler implements ApplicationListener<CustomEvent> {
    
    public void onApplicationEvent(CustomEvent event) {
        System.out.println(event.sayHello());
    }
}