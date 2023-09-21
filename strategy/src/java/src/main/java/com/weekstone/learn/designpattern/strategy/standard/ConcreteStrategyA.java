package com.weekstone.learn.designpattern.strategy.standard;

/**
 * 此次填写详细说明
 *
 * @author jinlei
 * @date 2023/2/9
 */
public class ConcreteStrategyA implements Strategy {

    @Override
    public void algorithmInterface() {
        System.out.println("run algorithmInterface() of the strategy A");
    }
}
