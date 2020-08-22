package com.maistruk.spring_1.beans;

public class BeanExample {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init() {
        String className = this.getClass().toString();
        className = className.substring(className.lastIndexOf(".") + 1);
        System.out.println(className + " init()");
    }

    public void destroy() {
        String className = this.getClass().toString();
        className = className.substring(className.lastIndexOf(".") + 1);
        System.out.println(className + " destroy()");
    }

}
