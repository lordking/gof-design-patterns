package com.weekstone.learn.designpattern.decorator.beverage.wrong.inherit;

/**
 * 被扩展的对象
 *
 * @author jinlei
 * @date 2023/1/28
 */
public abstract class Beverage {

    protected String description = "未知的饮料";

    public String getDescription() {
        return description;
    }

    public abstract float cost();
}
