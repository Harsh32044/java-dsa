package com.kunal.properties.intefaces;

public class CryoEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Starting Cryogenic Engine");
    }

    @Override
    public void acc() {
        System.out.println("Accelerating Cryogenic Engine");

    }

    @Override
    public void stop() {
        System.out.println("Stopping Cryogenic Engine");

    }
}
