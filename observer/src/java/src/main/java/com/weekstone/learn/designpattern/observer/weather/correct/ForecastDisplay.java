package com.weekstone.learn.designpattern.observer.weather.correct;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ForecastDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;

    public ForecastDisplay(Subject subject) {
        this.temperature = 0.0f;
        this.humidity = 0.0f;
        this.pressure = 0.0f;

        subject.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature + 1.0f;
        this.humidity = humidity + 1.0f;
        this.pressure = pressure + 1.0f;

        display();
    }

    @Override
    public void display() {
        log.info("Forest:  temperature: {}. humidity: {}, pressure: {}",
                temperature, humidity, pressure);
    }
}
