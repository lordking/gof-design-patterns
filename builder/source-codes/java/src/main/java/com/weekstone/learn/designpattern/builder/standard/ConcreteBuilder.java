package com.weekstone.learn.designpattern.builder.standard;

public class ConcreteBuilder implements Builder {
    private String partA;
    private String partB;
    private String partC;

    @Override
    public Builder buildPartA(String partA) {
        this.partA = partA;
        return this;
    }

    @Override
    public Builder buildPartB(String partB) {
        this.partB = partB;
        return this;
    }

    @Override
    public Builder buildPartC(String partC) {
        this.partC = partC;
        return this;
    }

    @Override
    public Product build() {
        return new Product(partA, partB, partC);
    }
}
