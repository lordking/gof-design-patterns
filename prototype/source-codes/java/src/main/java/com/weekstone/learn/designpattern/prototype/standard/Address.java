package com.weekstone.learn.designpattern.prototype.standard;

import lombok.Data;

import java.io.Serializable;

@Data
public class Address implements Serializable {
    private String address;

    public Address(String address) {
        this.address = address;
    }

    public void show() {
        System.out.println("Address: " + address);
    }
}
