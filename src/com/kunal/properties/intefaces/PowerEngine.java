package com.kunal.properties.intefaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power Engine started!");
    }

    @Override
    public void acc() {
        System.out.println("Power Engine accelerated!");

    }

    @Override
    public void stop() {
        System.out.println("Power Engine stopped!");

    }
}
