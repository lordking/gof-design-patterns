package com.weekstone.learn.designpattern.factorymethod.standard;

public class ConcreteFactory1 implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct1();
    }
}
