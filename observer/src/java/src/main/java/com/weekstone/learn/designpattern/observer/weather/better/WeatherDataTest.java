package com.weekstone.learn.designpattern.observer.weather.better;


class WeatherDataTest  {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new CurrentConditionsDisplay(weatherData);
        new StatisticsDisplay(weatherData);
        new ForecastDisplay(weatherData);

        weatherData.setMeasurements(10, 67, 44);
        weatherData.setMeasurements(11, 68, 50);
    }
}