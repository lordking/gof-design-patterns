package com.weekstone.learn.designpattern.observer.weather.wrong;

public class WeatherData {

    private float temperature;

    private float humidity;

    private float pressure;

    private CurrentConditionsDisplay currentConditionsDisplay;

    private StatisticsDisplay statisticsDisplay;

    private ForecastDisplay forecastDisplay;

    public WeatherData(CurrentConditionsDisplay currentConditionsDisplay,
                       StatisticsDisplay statisticsDisplay,
                       ForecastDisplay forecastDisplay) {
        this.currentConditionsDisplay = currentConditionsDisplay;
        this.statisticsDisplay = statisticsDisplay;
        this.forecastDisplay = forecastDisplay;
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
     *
     * 这种实现的错误：
     * - 我们针对具体实现编程，而非接口
     * - 我们尚未封装改变的部分
     * - 我们侵犯了WeatherData封装
     * - 我们无非在运行时动态增加或删除布告板
     */
    public void measurementsChanged() {
        float temperature = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        // 针对只体实现編桯. 会导致我 们以后 在增加或别除布告板时必须修改桯序
        // update看起来像是一个统一的接口， 布告板的方法名称都是update，参数也是一致的温度、湿度、气压
        currentConditionsDisplay.update(temperature, humidity, pressure);
        statisticsDisplay.update(temperature, humidity, pressure);
        forecastDisplay.update(temperature, humidity, pressure);
    }
}
