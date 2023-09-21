package com.weekstone.learn.designpattern.strategy.duck.wrong.interfaces;

import lombok.extern.slf4j.Slf4j;

/**
 * 此次填写详细说明
 *
 * @author jinlei
 * @date 2022/12/27
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
}
