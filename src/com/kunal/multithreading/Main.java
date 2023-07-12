package com.kunal.multithreading;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

        MyThread myThing = new MyThread(i);
        myThing.start();
        }
    }
}
