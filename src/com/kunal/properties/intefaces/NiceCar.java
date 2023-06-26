package com.kunal.properties.intefaces;

public class NiceCar {

    private Engine engine;
    private MediaPlayer mediaPlayer;

    public NiceCar() {
        engine = new PowerEngine();
        mediaPlayer = new CDPlayer();
    }

    public  NiceCar(Engine engine, MediaPlayer mediaPlayer) {
        this.engine = engine;
        this.mediaPlayer = mediaPlayer;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void accelerate() {
        engine.acc();
    }

    public void startMusic() {
        mediaPlayer.startMedia();
    }

    public void stopMusic() {
        mediaPlayer.stopMedia();
    }

    public void upgradeEngine(Engine newEngine) {
        this.engine = newEngine;
    }
}
