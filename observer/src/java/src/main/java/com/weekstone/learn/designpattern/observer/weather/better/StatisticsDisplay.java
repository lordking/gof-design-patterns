package com.weekstone.learn.designpattern.observer.weather.better;


import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

@Slf4j
public class StatisticsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;

    public StatisticsDisplay(Observable subject) {
        this.temperature = 0.0f;
        this.humidity = 0.0f;
        this.pressure = 0.0f;
        subject.addObserver(this);
    }

    @Override
    public void display() {
        log.info("Statistic:  temperature: {}. humidity: {}, pressure: {}",
                temperature, humidity, pressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;

            this.temperature = this.temperature > 0 ? (this.temperature + weatherData.getTemperature()) / 2 : temperature;
            this.humidity = this.humidity > 0 ? (this.humidity + weatherData.getHumidity()) / 2 : humidity;
            this.pressure = this.pressure > 0 ? (this.pressure + weatherData.getPressure()) / 2 : pressure;

            display();
        }
    }
}
