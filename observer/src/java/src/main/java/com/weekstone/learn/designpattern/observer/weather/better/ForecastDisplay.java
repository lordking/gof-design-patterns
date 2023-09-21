package com.weekstone.learn.designpattern.observer.weather.better;

import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

@Slf4j
public class ForecastDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;

    public ForecastDisplay(Observable subject) {
        this.temperature = 0.0f;
        this.humidity = 0.0f;
        this.pressure = 0.0f;

        subject.addObserver(this);
    }

    @Override
    public void display() {
        log.info("Forest:  temperature: {}. humidity: {}, pressure: {}",
                temperature, humidity, pressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature() + 1.0f;
            this.humidity = weatherData.getHumidity() + 1.0f;
            this.pressure = weatherData.getPressure() + 1.0f;
            display();
        }
    }
}
