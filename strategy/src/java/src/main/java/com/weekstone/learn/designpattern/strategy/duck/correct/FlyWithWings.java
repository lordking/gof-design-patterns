package com.weekstone.learn.designpattern.strategy.duck.correct;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyWithWings implements Flyable {

    @Override
    public void fly() {
        log.info("挥动翅膀飞起来");
    }
}
