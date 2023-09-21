package com.weekstone.learn.designpattern.decorator.beverage.correct;

/**
 * 调料：摩卡，被装饰的对象。
 *
 * @author jinlei
 * @date 2023/1/29
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + "摩卡";
    }

    @Override
    public float cost() {
        return beverage.cost() + 2.0f;
    }
}
