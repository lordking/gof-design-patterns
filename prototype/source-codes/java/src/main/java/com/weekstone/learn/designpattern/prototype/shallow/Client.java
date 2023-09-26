package com.weekstone.learn.designpattern.prototype.shallow;

import com.weekstone.learn.designpattern.prototype.Address;

public class Client {

    public static void main(String[] args) throws Exception {
        Address address = new Address("address1");
        ConcretePrototype prototype1 = new ConcretePrototype("value1", address);
        prototype1.show();

        System.out.println("====================================");

        // 浅拷贝：只拷贝基本类型，引用类型只拷贝引用
        ConcretePrototype prototype2 = prototype1.clone();

        // 当引用类型发生改变时，原型对象和克隆对象都会发生改变
        address.setAddress("address2"); 

        prototype1.show();
        prototype2.show();

    }
}
