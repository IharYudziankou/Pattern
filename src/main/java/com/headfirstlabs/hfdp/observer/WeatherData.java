package com.headfirstlabs.hfdp.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by Ihar_Yudziankou on 3/29/2017.
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    void mesurmentsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMesurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        mesurmentsChanged();
    }

    public float getTemperature(){
        return temperature;
    }

    public float getHumidity(){
        return humidity;
    }

    public float getPressure(){
        return pressure;
    }

}
