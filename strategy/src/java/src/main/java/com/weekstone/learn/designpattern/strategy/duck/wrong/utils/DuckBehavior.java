package com.weekstone.learn.designpattern.strategy.duck.wrong.utils;

import lombok.extern.slf4j.Slf4j;

/**
 * 此次填写详细说明
 *
 * @author jinlei
 * @date 2022/12/28
 */
@Slf4j
public class DuckBehavior {

    public void fly() {
        log.info("挥动翅膀飞起来");
    }

    public void quack() {
        log.info("呱呱叫");
    }
}
