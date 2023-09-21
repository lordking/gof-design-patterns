package com.weekstone.learn.designpattern.decorator.beverage.wrong.override;

public class Whip {

    private final String description;

    public Whip() {
        description = "奶泡";
    }

    public String getDescription() {
        return description;
    }

    public float cost() {
        return 1.2f;
    }
}
