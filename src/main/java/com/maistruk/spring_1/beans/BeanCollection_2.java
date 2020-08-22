package com.maistruk.spring_1.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class BeanCollection_2 {

    List<Address> addressList;
    Set<Address> addressSet;
    Map<Integer, Address> addressMap;

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public Set<Address> getAddressSet() {
        return addressSet;
    }

    public void setAddressSet(Set<Address> addressSet) {
        this.addressSet = addressSet;
    }

    public Map<Integer, Address> getAddressMap() {
        return addressMap;
    }

    public void setAddressMap(Map<Integer, Address> addressMap) {
        this.addressMap = addressMap;
    }

}
