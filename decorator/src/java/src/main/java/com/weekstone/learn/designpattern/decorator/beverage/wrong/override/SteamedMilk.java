package com.weekstone.learn.designpattern.decorator.beverage.wrong.override;

public class SteamedMilk {

    private final String description;

    public SteamedMilk() {
        description = "蒸奶";
    }

    public String getDescription() {
        return description;
    }

    public float cost() {
        return 1.0f;
    }
}
