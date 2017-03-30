package com.headfirstlabs.hfdp.observer;

/**
 * Created by Ihar_Yudziankou on 3/29/2017.
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
