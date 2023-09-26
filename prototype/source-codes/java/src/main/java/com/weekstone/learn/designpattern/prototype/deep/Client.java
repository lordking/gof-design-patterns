package com.weekstone.learn.designpattern.prototype.deep;

import com.weekstone.learn.designpattern.prototype.Address;
import com.weekstone.learn.designpattern.prototype.shallow.ConcretePrototype;

public class Client {

    public static void main(String[] args) throws Exception {

        Address address = new Address("address1");
        ConcretePrototype prototype1 = new ConcretePrototype("value1", address);
        prototype1.show();

        // 深拷贝：所有类型都拷贝
        ConcretePrototype prototype2 = prototype1.clone();
        prototype2.setField1("value2");

        // 当引用类型发生改变时，原型对象和克隆对象都不会发生改变
        address.setAddress("address3"); 

        prototype1.show();
        prototype2.show();
    }
}
