package com.headfirstlabs.hfdp.observer;

import com.headfirstlabs.hfdp.observer.display.*;

/**
 * Created by Администратор on 30.03.2017.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMesurements(80,65, 30.4f);
        weatherData.setMesurements(82,70, 29.2f);
        weatherData.setMesurements(78,90, 29.2f);
    }
}
