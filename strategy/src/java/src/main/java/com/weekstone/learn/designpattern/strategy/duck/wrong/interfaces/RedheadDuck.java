package com.weekstone.learn.designpattern.strategy.duck.wrong.interfaces;

import lombok.extern.slf4j.Slf4j;

/**
 * 此次填写详细说明
 *
 * @author jinlei
 * @date 2022/12/27
 */
@Slf4j
public class RedheadDuck extends Duck implements Flyable, Quackable {

    public RedheadDuck(String name) {
        super(name);
    }

    @Override
    public void display() {
        log.info("头是绿色的");
    }

    @Override
    public void fly() {
        log.info("挥动翅膀飞起来");
    }

    @Override
    public void quack() {
        log.info("呱呱叫");
    }
}
