package com.weekstone.learn.designpattern.prototype;

import lombok.Data;
import lombok.ToString;

import java.io.*;

/**
 * 浅拷贝：只拷贝基本类型，引用类型只拷贝引用
 */
@Data
@ToString
public class ShallowPrototype implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

    private String field1;
    private Address address;

    public ShallowPrototype(String field1, Address address) {
        this.field1 = field1;
        this.address = address;
    }

    @Override
    public ShallowPrototype clone() throws CloneNotSupportedException {
        return  (ShallowPrototype) super.clone();
    }

}
