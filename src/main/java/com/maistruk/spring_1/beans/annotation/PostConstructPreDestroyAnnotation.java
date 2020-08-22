package com.maistruk.spring_1.beans.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class PostConstructPreDestroyAnnotation {

    private String message;

    public void setMessage(String message){
       this.message  = message;
    }
    public String getMessage(){
       return message;
    }
    
    @PostConstruct
    public void init(){
       System.out.println("Bean is going through init.");
    }
    
    @PreDestroy
    public void destroy(){
       System.out.println("Bean will destroy now.");
    }
}
