package com.weekstone.learn.designpattern.builder.standard;

public interface Builder {
    Builder buildPartA(String partA);
    Builder buildPartB(String partB);
    Builder buildPartC(String partC);

    Product build();
}
