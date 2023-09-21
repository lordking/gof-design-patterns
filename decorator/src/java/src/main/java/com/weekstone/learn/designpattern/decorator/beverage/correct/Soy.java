package com.weekstone.learn.designpattern.decorator.beverage.correct;

/**
 * 调料：豆浆，被装饰的对象。
 *
 * @author jinlei
 * @date 2023/1/29
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + "豆浆";
    }

    @Override
    public float cost() {
        return beverage.cost() + 1.5f;
    }
}
