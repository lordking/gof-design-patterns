package com.weekstone.learn.designpattern.builder.standard;

public class Product {
    private final String partA;
    private final String partB;
    private final String partC;

    public Product(String partA, String partB, String partC) {
        this.partA = partA;
        this.partB = partB;
        this.partC = partC;
    }

    public String getPartA() {
        return partA;
    }

    public String getPartB() {
        return partB;
    }

    public String getPartC() {
        return partC;
    }
}
