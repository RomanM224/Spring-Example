package com.maistruk.spring_1.beans.annotation;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {
    
    public CustomEvent(Object source) {
        super(source);
    }

    public String sayHello() {
        return "Holle Custom Event";
    }
}