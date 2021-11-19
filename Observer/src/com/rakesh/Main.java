package com.rakesh;

import com.rakesh.observers.CurrentDataDisplay;
import com.rakesh.observers.StatisticsDisplay;

public class Main {
    //Weather Station
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentDataDisplay currentDataDisplay = new CurrentDataDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(40, 49, 39);
        weatherData.setMeasurements(50, 50, 60);
        weatherData.removeObserver(statisticsDisplay);
        weatherData.setMeasurements(45, 100, 15);
    }
}
