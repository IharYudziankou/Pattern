package com.headfirstlabs.hfdp.observer;

/**
 * Created by Ihar_Yudziankou on 3/29/2017.
 */
@Deprecated
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
