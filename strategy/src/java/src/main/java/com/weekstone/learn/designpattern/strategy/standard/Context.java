package com.weekstone.learn.designpattern.strategy.standard;

/**
 * 此次填写详细说明
 *
 * @author jinlei
 * @date 2023/2/9
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface() {
        strategy.algorithmInterface();
    }
}
