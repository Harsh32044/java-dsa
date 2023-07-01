package com.kunal.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; //also serving as index variable. Size refers to the number of elements inserted

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int element) {
        if (isFull()) {
            resize();
        }
        data[size++] = element; //maintaining the size, can get the index of last inserted element via this 'size' field.
    }

    private boolean isFull() {
        return size == data.length;
    }

    public void resize() {
        int[] temp = new int[data.length * 2];

        System.arraycopy(data, 0, temp, 0, data.length);

        data = temp;
    }

    public int remove() {
        return data[--size];
    }

    public int get(int index) {
        return data[index];
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{ " +
                "data= " + Arrays.toString(data) +
                ", size= " + size + " }";
    }

    public static void main(String[] args) {

        CustomArrayList list = new CustomArrayList();

        list.add(3);
        list.add(5);
        list.add(9);

        System.out.println(list.toString());

    }
}
