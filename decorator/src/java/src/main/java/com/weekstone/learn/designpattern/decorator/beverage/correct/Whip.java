package com.weekstone.learn.designpattern.decorator.beverage.correct;

/**
 * 调料：奶泡，被装饰的对象。
 *
 * @author jinlei
 * @date 2023/1/29
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + "奶泡";
    }

    @Override
    public float cost() {
        return beverage.cost() + 1.5f;
    }
}
