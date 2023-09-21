package com.weekstone.learn.designpattern.decorator.beverage.wrong.inherit;

/**
 * 此次填写详细说明
 *
 * @author jinlei
 * @date 2023/1/28
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "综合咖啡，又称星巴克首选咖啡";
    }

    @Override
    public float cost() {
        return 8.9f;
    }
}
