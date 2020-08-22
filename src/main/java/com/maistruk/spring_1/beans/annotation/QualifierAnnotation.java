package com.maistruk.spring_1.beans.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.maistruk.spring_1.beans.Address;

public class QualifierAnnotation {

    @Autowired
    @Qualifier("address1")
    private Address address1;
    @Autowired
    @Qualifier("address2")
    private Address address2;

    public Address getAddress1() {
        return address1;
    }

    public void setAddress1(Address address1) {
        this.address1 = address1;
    }

    public Address getAddress2() {
        return address2;
    }

    public void setAddress2(Address address2) {
        this.address2 = address2;
    }

}
