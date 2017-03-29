package com.headfirstlabs.hfdp.observer;

/**
 * Created by Ihar_Yudziankou on 3/29/2017.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
