package com.kunal.multithreading;

public class MyThreadRunnable implements Runnable{
    // everything else same as if extends Thread

    private int threadNumber;

    public MyThreadRunnable(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from Thread Number "+threadNumber);
            try {

                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
            }
        }
    }
}
