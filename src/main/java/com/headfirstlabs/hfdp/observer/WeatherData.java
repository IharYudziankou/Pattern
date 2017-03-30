package com.headfirstlabs.hfdp.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ihar_Yudziankou on 3/29/2017.
 */
public class WeatherData implements Subject {

    private List<Observer> observers;

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    float getTemperature(){
        return 0;
    }

    float getHumidity(){
        return 0;
    }

    float getPressure(){
        return 0;
    }

    void mesurmentsChanged(){
        notifyObservers();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMesurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        mesurmentsChanged();
    }
}
