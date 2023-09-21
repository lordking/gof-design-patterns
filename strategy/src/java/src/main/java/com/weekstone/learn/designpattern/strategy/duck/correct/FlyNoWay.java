package com.weekstone.learn.designpattern.strategy.duck.correct;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyNoWay implements Flyable {

    @Override
    public void fly() {
        log.info("不会飞");
    }
}
