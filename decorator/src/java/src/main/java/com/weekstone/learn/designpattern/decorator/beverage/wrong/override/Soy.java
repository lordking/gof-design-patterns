package com.weekstone.learn.designpattern.decorator.beverage.wrong.override;

public class Soy {

    private final String description;

    public Soy() {
        description = "豆浆";
    }

    public String getDescription() {
        return description;
    }

    public float cost() {
        return 1.5f;
    }
}
