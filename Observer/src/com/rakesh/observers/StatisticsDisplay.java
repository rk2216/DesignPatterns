package com.rakesh.observers;

import com.rakesh.Subject;
import com.rakesh.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float pressure;
    private WeatherData weatherData;
    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Temperature : Pressure ratio is: " + temperature/pressure);
    }

    @Override
    public void update(Subject subject, Object arg) {
        this.temperature = weatherData.getTemperature();
        this.pressure = weatherData.getPressure();
        display();
    }
}
