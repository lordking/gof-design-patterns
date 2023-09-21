package com.weekstone.learn.designpattern.strategy.duck.correct;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Squeak implements Quackable {
    @Override
    public void quack() {
        log.info("吱吱叫");
    }
}
