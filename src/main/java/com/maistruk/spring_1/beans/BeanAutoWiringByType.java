package com.maistruk.spring_1.beans;

public class BeanAutoWiringByType {

    Address address;
    
    String message;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address1) {
        this.address = address1;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
