package com.kunal.singleton;

public class Singleton {

    //Only one object to be created

    private static Singleton instance;
    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
