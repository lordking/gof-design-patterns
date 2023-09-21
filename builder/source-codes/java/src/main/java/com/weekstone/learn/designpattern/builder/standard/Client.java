package com.weekstone.learn.designpattern.builder.standard;

public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();

        System.out.println("Product partA: " + product.getPartA());
        System.out.println("Product partB: " + product.getPartB());
        System.out.println("Product partC: " + product.getPartC());
    }
}
