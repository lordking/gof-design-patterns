package com.weekstone.learn.designpattern.decorator.beverage.wrong.override;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "深度烘焙咖啡";
    }

    @Override
    public String getDescription() {
        return description + super.getDescription();
    }

    @Override
    public float cost() {
        return 9.9f + super.cost();
    }
}
