package com.weekstone.learn.designpattern.decorator.beverage.wrong.inherit;

/**
 * 此次填写详细说明
 *
 * @author jinlei
 * @date 2023/1/28
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "深度烘焙咖啡";
    }

    @Override
    public float cost() {
        return 9.9f;
    }
}
