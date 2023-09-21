package com.weekstone.learn.designpattern.decorator.beverage.correct;

/**
 * 创建一个调料的装饰器
 *
 * @author jinlei
 * @date 2023/1/29
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
}
