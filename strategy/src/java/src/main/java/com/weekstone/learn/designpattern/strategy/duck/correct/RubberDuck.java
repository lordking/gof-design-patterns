package com.weekstone.learn.designpattern.strategy.duck.correct;

import lombok.extern.slf4j.Slf4j;

/**
 * 橡皮鸭
 *
 * @author jinlei
 * @date 2022/12/27
 */
@Slf4j
public class RubberDuck extends Duck {

    public RubberDuck(String name) {
        super(name);
        setFlyable(new FlyNoWay());
        setQuackable(new Squeak());
    }

    @Override
    public void display() {
        log.info("橡皮做的");
    }

}
