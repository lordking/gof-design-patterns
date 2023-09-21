package com.weekstone.learn.designpattern.factorymethod.standard;

public class ConcreteFactory2 implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct2();
    }
}
