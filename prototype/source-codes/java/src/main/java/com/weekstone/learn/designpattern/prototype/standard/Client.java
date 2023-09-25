package com.weekstone.learn.designpattern.prototype.standard;

public class Client {

    public static void main(String[] args) throws Exception {
        Address address = new Address("address1");
        ConcretePrototype prototype1 = new ConcretePrototype("value1", address);
        prototype1.show();

        System.out.println("====================================");

        // 浅拷贝：只拷贝基本类型，引用类型只拷贝引用
        ConcretePrototype prototype2 = prototype1.clone();
        prototype2.setField1("value2");
        address.setAddress("address2"); // 发现这里修改了address，prototype1和prototype2的address都变了

        prototype1.show();
        prototype2.show();

        System.out.println("====================================");

        // 深拷贝：所有类型都拷贝
        ConcretePrototype prototype3 = prototype1.deepClone();
        prototype3.setField1("value3");
        address.setAddress("address3"); // 发现这里修改了address，prototype1和prototype3的address都没变

        prototype1.show();
        prototype3.show();
    }
}
