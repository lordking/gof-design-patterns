package com.weekstone.learn.designpattern.decorator.beverage.correct;


/**
 * 无咖啡因咖啡
 *
 * @author jinlei
 * @date 2023/1/28
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "无咖啡因咖啡";
    }

    @Override
    public float cost() {
        return 10.9f;
    }
}
