package com.kunal.multithreading;

public class Main {
    public static void main(String[] args) {

        //with MyThread class, extending Thread
        for (int i = 0; i < 5; i++) {

        MyThread myThing = new MyThread(i);
        myThing.start();
        }

        //with MyThreadRunnable class, implementing Runnable interface

        for (int i = 0; i < 5; i ++) {
            MyThreadRunnable objRun = new MyThreadRunnable(i);
            Thread myThread = new Thread(objRun);
            myThread.start();
        }
    }
}
