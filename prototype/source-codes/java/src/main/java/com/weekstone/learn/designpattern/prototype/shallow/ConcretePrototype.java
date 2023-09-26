package com.weekstone.learn.designpattern.prototype.shallow;

import lombok.Data;

import java.io.*;

import com.weekstone.learn.designpattern.prototype.Address;

@Data
public class ConcretePrototype implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

    private String field1;
    private Address address;

    public ConcretePrototype(String field1, Address address) {
        this.field1 = field1;
        this.address = address;
    }

    public void show() {
        System.out.println("ConcretePrototype: " + field1 + ", " + address.getAddress());
    }

    /**
     * 浅拷贝：只拷贝基本类型，引用类型只拷贝引用
     * @return ConcretePrototype
     */
    @Override
    public ConcretePrototype clone() throws CloneNotSupportedException {
        return  (ConcretePrototype) super.clone();
    }

}
