package com.maistruk.spring_1.beans;

public class BeanAutoWiringConstructor {

    Address address;
    String message;

    public BeanAutoWiringConstructor(Address address, String message) {
        this.address = address;
        this.message = message;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
