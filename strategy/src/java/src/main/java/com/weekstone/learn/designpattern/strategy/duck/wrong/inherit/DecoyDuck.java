package com.weekstone.learn.designpattern.strategy.duck.wrong.inherit;

import lombok.extern.slf4j.Slf4j;

/**
 * 此次填写详细说明
 *
 * @author jinlei
 * @date 2022/12/26
 */
@Slf4j
public class DecoyDuck extends Duck {

    public DecoyDuck(String name) {
        super(name);
    }

    @Override
    public void display() {
        log.info("木头做的");
    }

    @Override
    public void fly() {
        log.info("不会飞");
    }

    @Override
    public void quack() {
        log.info("不会叫");
    }

}