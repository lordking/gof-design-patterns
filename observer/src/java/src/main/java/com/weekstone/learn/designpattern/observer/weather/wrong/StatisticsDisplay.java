package com.weekstone.learn.designpattern.observer.weather.wrong;

public class StatisticsDisplay {

    private float temperature;
    private float humidity;
    private float pressure;

    public StatisticsDisplay() {
        this.temperature = 0.0f;
        this.humidity = 0.0f;
        this.pressure = 0.0f;
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = this.temperature > 0 ? (this.temperature + temperature) / 2 : temperature;
        this.humidity = this.humidity > 0 ? (this.humidity + humidity) / 2 : humidity;
        this.pressure = this.pressure > 0 ? (this.pressure + pressure) / 2 : pressure;
    }
}
