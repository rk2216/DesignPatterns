package com.rakesh;

import com.rakesh.observers.Observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    WeatherData(){
        observers = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers(Object arg) {
        for (Observer observer: observers){
            observer.update(this, arg);
        }
    }
    @Override
    public void notifyAllObservers() {
        notifyAllObservers(null);
    }
    void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    void measurementsChanged(){
        notifyAllObservers();
    }
    public float getHumidity() {
        return humidity;
    }
    public float getPressure() {
        return pressure;
    }
    public float getTemperature() {
        return temperature;
    }
}
