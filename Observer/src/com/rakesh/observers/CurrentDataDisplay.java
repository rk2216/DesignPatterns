package com.rakesh.observers;

import com.rakesh.Subject;
import com.rakesh.WeatherData;

public class CurrentDataDisplay implements Observer, DisplayElement {
    private float temperature;
    private float pressure;
    private float humidity;
    private WeatherData weatherData;
    public CurrentDataDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(Subject subject, Object arg) {
        WeatherData weatherData = (WeatherData) subject;
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Weather Details are: Temperature: " + this.temperature + " ; Humidity: " + this.humidity);
    }
}
