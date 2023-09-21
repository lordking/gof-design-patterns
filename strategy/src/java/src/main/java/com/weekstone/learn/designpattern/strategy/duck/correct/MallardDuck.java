package com.weekstone.learn.designpattern.strategy.duck.correct;

import lombok.extern.slf4j.Slf4j;

/**
 * 绿头鸭
 *
 * @author jinlei
 * @date 2022/12/26
 */
@Slf4j
public class MallardDuck extends Duck {

    public MallardDuck(String name) {
        super(name);
        setFlyable(new FlyWithWings());
        setQuackable(new Quack());
    }

    @Override
    public void display() {
        log.info("头是绿色的");
    }
}
