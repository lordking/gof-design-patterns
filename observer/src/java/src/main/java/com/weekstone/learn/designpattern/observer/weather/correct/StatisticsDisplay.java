package com.weekstone.learn.designpattern.observer.weather.correct;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StatisticsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;

    public StatisticsDisplay(Subject subject) {
        this.temperature = 0.0f;
        this.humidity = 0.0f;
        this.pressure = 0.0f;
        subject.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = this.temperature > 0 ? (this.temperature + temperature) / 2 : temperature;
        this.humidity = this.humidity > 0 ? (this.humidity + humidity) / 2 : humidity;
        this.pressure = this.pressure > 0 ? (this.pressure + pressure) / 2 : pressure;

        display();
    }

    @Override
    public void display() {
        log.info("Statistic:  temperature: {}. humidity: {}, pressure: {}",
                temperature, humidity, pressure);
    }
}
