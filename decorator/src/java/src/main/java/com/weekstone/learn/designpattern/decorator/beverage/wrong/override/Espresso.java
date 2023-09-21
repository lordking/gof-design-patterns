package com.weekstone.learn.designpattern.decorator.beverage.wrong.override;

public class Espresso extends Beverage {

    public Espresso() {
        description = "蒸馏咖啡，又称意式咖啡";
    }

    @Override
    public String getDescription() {
        return description + super.getDescription();
    }

    @Override
    public float cost() {
        return 18.9f + super.cost();
    }
}
