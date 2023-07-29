package com.kunal.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorTesting {
    public static void main(String[] args) throws InterruptedException {

        int size = 927328;

        List<Integer> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();

        for (int i = 0; i< size; i++) {
            arrayList.add(i);
        }
        long stop = System.currentTimeMillis();

        System.out.println("Added " + size + " elements to ArrayList: " + (stop - start)+"ms");

        List<Integer> vector = new Vector<>();

        start = System.currentTimeMillis();

        for (int i = 0; i< size; i++) {
            vector.add(i);
        }
        stop = System.currentTimeMillis();

        System.out.println("Added " + size + " elements to Vector: " + (stop - start)+"ms");


        List<Integer> multiThreadedList = Collections.synchronizedList(new ArrayList<>());
        start = System.currentTimeMillis();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i< size; i++) {
                multiThreadedList.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i< size; i++) {
                multiThreadedList.add(i);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        stop = System.currentTimeMillis();
        System.out.println("Added " + size +
                " elements to ArrayList in multithreaded environment: " +
                (stop - start) + "ms");
        System.out.println("Size of multithreaded Arraylist: "+ multiThreadedList.size());

        List<Integer> multiThreadedVector = new Vector<>();
        start = System.currentTimeMillis();

        t1 = new Thread(() -> {
            for (int i = 0; i< size; i++) {
                multiThreadedVector.add(i);
            }
        });

        t2 = new Thread(() -> {
            for (int i = 0; i< size; i++) {
                multiThreadedVector.add(i);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        stop = System.currentTimeMillis();
        System.out.println("Added " + size +
                " elements to Vector in multithreaded environment: " +
                (stop - start) + "ms");
        System.out.println("Size of multithreaded Vector: "+ multiThreadedVector.size());

    }
}
