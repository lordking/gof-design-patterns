package com.weekstone.learn.designpattern.strategy.duck.wrong.inherit;

import lombok.extern.slf4j.Slf4j;

/**
 * 此次填写详细说明
 *
 * @author jinlei
 * @date 2022/12/26
 */
@Slf4j
public abstract class Duck {

    private static String name;

    public Duck(String name) {
        setName(name);
    }

    private void setName(String name) {
        this.name = name;
    }

    public void displayName() {
        log.info("鸭子种类: {}", name);
    }

    public void quack() {
        log.info("呱呱叫");
    }

    public void swim() {
        log.info("在水中游荡");
    }

    public void fly() {
        log.info("挥动翅膀飞起来");
    }

    public abstract void display();
}
