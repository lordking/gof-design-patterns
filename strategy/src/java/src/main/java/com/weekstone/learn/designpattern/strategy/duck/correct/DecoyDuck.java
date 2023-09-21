package com.weekstone.learn.designpattern.strategy.duck.correct;

import lombok.extern.slf4j.Slf4j;

/**
 * 诱饵鸭
 *
 * @author jinlei
 * @date 2022/12/27
 */
@Slf4j
public class DecoyDuck extends Duck {

    public DecoyDuck(String name) {
        super(name);
        setFlyable(new FlyNoWay());
        setQuackable(new MuteQuack());
    }

    @Override
    public void display() {
        log.info("木头做的");
    }
}
