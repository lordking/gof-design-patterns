package com.weekstone.learn.designpattern.decorator.beverage.wrong.override;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "综合咖啡，又称星巴克首选咖啡";
    }

    @Override
    public String getDescription() {
        return description + super.getDescription();
    }

    @Override
    public float cost() {
        return 8.9f + super.cost();
    }
}
