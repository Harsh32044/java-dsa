package com.kunal.properties.intefaces;

public class Car implements Engine, Brake, MediaPlayer{
    @Override
    public void brake() {
        System.out.println("I brake like a normal car.");
    }

    @Override
    public void start() {
        System.out.println("I start like a normal car.");

    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a normal car.");

    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal car.");

    }

    @Override
    public void startMedia() {
        System.out.println("I play music/video like a normal car");

    }

    @Override
    public void stopMedia() {
        System.out.println("I stop music/video like a normal car");

    }
}
