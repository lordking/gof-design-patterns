package com.weekstone.learn.designpattern.strategy.duck.wrong.inherit;

import lombok.extern.slf4j.Slf4j;

/**
 * 此次填写详细说明
 *
 * @author jinlei
 * @date 2022/12/26
 */
@Slf4j
public class RubberDuck extends Duck {

    public RubberDuck(String name) {
        super(name);
    }

    @Override
    public void display() {
        log.info("橡皮做的");
    }

    @Override
    public void fly() {
        log.info("不会飞");
    }
}