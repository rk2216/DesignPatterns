package com.rakesh;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float pressure;
    private void measurementsChanged() {
        this.setChanged();
        this.notifyObservers();
    }
    public void setMeasurements(float temperature, float pressure){
        if(temperature < this.temperature + 0.9){
            return;
        }
        this.temperature = temperature;
        this.pressure = pressure;
        measurementsChanged();
    }
    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }
}
