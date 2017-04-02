package com.headfirstlabs.hfdp.singelton;

/**
 * Created by Администратор on 02.04.2017.
 */
public class Singelton {
    private volatile static Singelton instance;
    private Singelton(){

    }

    public static Singelton getInstance() {
        if (instance == null) {
            synchronized (Singelton.class) {
                if (instance == null) {
                    instance = new Singelton();
                }
            }
        }
        return instance;
    }
}
