package com.weekstone.learn.designpattern.decorator.beverage.correct;

/**
 * 蒸馏咖啡
 *
 * @author jinlei
 * @date 2023/1/28
 */
public class Espresso extends Beverage {

    public Espresso() {
        this.description = "蒸馏咖啡，又称意式咖啡";
    }

    @Override
    public float cost() {
        return 18.9f;
    }
}
