package com.weekstone.learn.designpattern.abstractfactory.standard;

public class Client {
    public static void main(String[] args) {
        createProductsWithFactory1();
        createProductsWithFactory2();
    }

    private static void createProductsWithFactory1() {
        Factory factory = new ConcreteFactory1();
        ProductA productA = factory.createProductA();
        productA.show();

        ProductB productB = factory.createProductB();
        productB.display();
    }

    private static void createProductsWithFactory2() {
        Factory factory = new ConcreteFactory2();
        ProductA productA = factory.createProductA();
        productA.show();

        ProductB productB = factory.createProductB();
        productB.display();
    }
}
