package com.headfirstlabs.hfdp.observer.display;

import com.headfirstlabs.hfdp.observer.Subject;
import com.headfirstlabs.hfdp.observer.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Администратор on 30.03.2017.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Current conditions : " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
