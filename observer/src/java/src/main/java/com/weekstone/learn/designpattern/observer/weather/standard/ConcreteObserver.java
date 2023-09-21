package com.weekstone.learn.designpattern.observer.weather.standard;

import lombok.extern.slf4j.Slf4j;

public class ConcreteObserver implements Observer {

    @Override
    public void update(String state) {
        System.out.println("state: " + state);
    }
}
