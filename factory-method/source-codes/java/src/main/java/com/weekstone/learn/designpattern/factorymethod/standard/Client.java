package com.weekstone.learn.designpattern.factorymethod.standard;

public class Client {
    public static void main(String[] args) {
        createProductWithConcreteFactory1();
        createProductWithConcreteFactory2();
    }

    private static void createProductWithConcreteFactory1() {
        Factory factory = new ConcreteFactory1();
        Product product = factory.createProduct();
        product.show();
    }

    private static void createProductWithConcreteFactory2() {
        Factory factory = new ConcreteFactory2();
        Product product = factory.createProduct();
        product.show();
    }
}
