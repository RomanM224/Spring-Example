package com.maistruk.spring_1.beans.annotation;

import org.springframework.beans.factory.annotation.Value;

public class BeanFoo {
    
    @Value("I am Foo bean")
    private String message;
    private BeanBar bar;
    
    public BeanFoo(BeanBar bar) {
        this.bar = bar;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BeanBar getBar() {
        return bar;
    }

    public void setBar(BeanBar bar) {
        this.bar = bar;
    }
    
    
}
