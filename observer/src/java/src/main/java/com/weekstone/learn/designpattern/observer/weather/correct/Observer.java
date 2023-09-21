package com.weekstone.learn.designpattern.observer.weather.correct;

public interface Observer {

    void update(float temperature, float humidity, float pressure);
}
