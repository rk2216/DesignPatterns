package com.rakesh.observers;

import com.rakesh.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentDataDisplay implements Observer, DisplayElement {
    private float temperature;
    private float pressure;
    private Observable observable;
    public CurrentDataDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Current Temperature: " + this.temperature + " ; Pressure: " + this.pressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.pressure = weatherData.getPressure();
            display();
        }
    }
}
