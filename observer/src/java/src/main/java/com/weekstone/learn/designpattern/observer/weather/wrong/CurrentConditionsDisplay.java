package com.weekstone.learn.designpattern.observer.weather.wrong;

public class CurrentConditionsDisplay {

    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay() {
        this.temperature = 0.0f;
        this.humidity = 0.0f;
        this.pressure = 0.0f;
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
