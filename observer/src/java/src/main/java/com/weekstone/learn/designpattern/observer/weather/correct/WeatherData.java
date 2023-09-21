package com.weekstone.learn.designpattern.observer.weather.correct;

import java.util.HashSet;
import java.util.Set;

public class WeatherData implements Subject {

    private float temperature;

    private float humidity;

    private float pressure;

    private Set<Observer> observers;

    public WeatherData() {
        observers = new HashSet<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    /**
     * 实现该方法，更新温度、湿度、气压。
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature,
                                float humidity,
                                float pressure) {
        setTemperature(temperature);
        setHumidity(humidity);
        setPressure(pressure);

        measurementsChanged();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {

        if (observers.contains(o)) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(getTemperature(),
                    getHumidity(),
                    getPressure());
        }
    }
}
