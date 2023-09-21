package com.weekstone.learn.designpattern.observer.weather.wrong;

public class ForecastDisplay {

    private float temperature;
    private float humidity;
    private float pressure;

    public ForecastDisplay() {
        this.temperature = 0.0f;
        this.humidity = 0.0f;
        this.pressure = 0.0f;
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature + 1;
        this.humidity = humidity + 1;
        this.pressure = pressure + 1;
    }
}
