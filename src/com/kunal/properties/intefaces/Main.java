package com.kunal.properties.intefaces;

public class Main {
    public static void main(String[] args) {
        Car  car = new Car();

//        car.start();

        NiceCar nc = new NiceCar();

        nc.start();
        nc.startMusic();

        nc.upgradeEngine(new ElectricEngine());
        nc.start();
        nc.accelerate();
        nc.stop();


        nc.upgradeEngine(new CryoEngine());
        nc.start();
        nc.accelerate();
        nc.stop();

    }
}
