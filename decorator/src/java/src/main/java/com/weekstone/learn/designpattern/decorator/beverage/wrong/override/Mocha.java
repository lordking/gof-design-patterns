package com.weekstone.learn.designpattern.decorator.beverage.wrong.override;

public class Mocha {

    private final String description;

    public Mocha() {
        description = "摩卡";
    }

    public String getDescription() {
        return description;
    }

    public float cost() {
        return 2.0f;
    }
}
