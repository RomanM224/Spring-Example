package com.maistruk.spring_1.beans.annotation;

import org.springframework.beans.factory.annotation.Value;

public class BeanBar {
    
    @Value("I am Bar bean")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    

}
