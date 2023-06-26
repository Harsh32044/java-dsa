package com.kunal.properties.intefaces;

public class CDPlayer implements MediaPlayer{
    @Override
    public void startMedia() {
        System.out.println("Starting media player");
    }

    @Override
    public void stopMedia() {
        System.out.println("Stopping media player");

    }
}
