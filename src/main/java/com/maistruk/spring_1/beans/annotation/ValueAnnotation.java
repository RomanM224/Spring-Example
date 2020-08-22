package com.maistruk.spring_1.beans.annotation;

import org.springframework.beans.factory.annotation.Value;

public class ValueAnnotation {
    
    @Value("Roman")
    private String name;
    
    @Value("21")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
    

}
