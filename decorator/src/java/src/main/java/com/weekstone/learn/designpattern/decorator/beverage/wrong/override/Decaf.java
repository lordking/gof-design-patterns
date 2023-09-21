package com.weekstone.learn.designpattern.decorator.beverage.wrong.override;

public class Decaf extends Beverage {

    public Decaf() {
        description = "无咖啡因咖啡";
    }

    @Override
    public String getDescription() {
        return description + super.getDescription();
    }

    @Override
    public float cost() {
        return 10.9f + super.cost();
    }
}
