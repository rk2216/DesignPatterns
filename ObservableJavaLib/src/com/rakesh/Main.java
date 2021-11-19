package com.rakesh;

import com.rakesh.observers.CurrentDataDisplay;

public class Main {
    // Weather station
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentDataDisplay currentDataDisplay = new CurrentDataDisplay(weatherData);

        weatherData.setMeasurements(12, 23);
        weatherData.setMeasurements(12.5f, 23);
        weatherData.setMeasurements(13, 25);
    }
}
