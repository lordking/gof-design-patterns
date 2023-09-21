package com.weekstone.learn.designpattern.decorator.beverage.correct;

/**
 * 调料：蒸奶，被装饰的对象。
 *
 * @author jinlei
 * @date 2023/1/29
 */
public class SteamedMilk extends CondimentDecorator {

    Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + "蒸奶";
    }

    @Override
    public float cost() {
        return beverage.cost() + 1.0f;
    }
}
