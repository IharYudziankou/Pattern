package com.headfirstlabs.hfdp.observer;

/**
 * Created by Ihar_Yudziankou on 3/29/2017.
 */
public class WeatherData implements Subject {

    private DisplayElement currentConditionDisplay;
    private DisplayElement statisticDisplay;
    private DisplayElement forecastDisplay;

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

        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionDisplay.update(temp, humidity, pressure);
        statisticDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);

    }

}
