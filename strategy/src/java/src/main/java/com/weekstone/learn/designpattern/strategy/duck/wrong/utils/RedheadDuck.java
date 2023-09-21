package com.weekstone.learn.designpattern.strategy.duck.wrong.utils;

import lombok.extern.slf4j.Slf4j;

/**
 * 此次填写详细说明
 *
 * @author jinlei
 * @date 2022/12/26
 */
@Slf4j
public class RedheadDuck extends Duck {

    private DuckBehavior duckBehavior;

    public RedheadDuck(String name) {
        super(name);
        duckBehavior = new DuckBehavior();
    }

    @Override
    public void display() {
        log.info("头是红色的");
    }

    public void quack() {
        duckBehavior.quack();
    }

    public void fly() {
        duckBehavior.fly();
    }
}
