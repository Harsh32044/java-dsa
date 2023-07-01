package com.kunal.generics;

import java.util.Arrays;

public class CustomGenericArrayList<GenericType> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(GenericType elem) {
        if (isFull()) {
            resize();
        }
        data[size++] = elem;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public void resize() {
        Object[] temp = new Object[data.length * 2];

        System.arraycopy(data, 0, temp, 0, data.length);

        data = temp;
    }

    public GenericType remove() {
        GenericType removed = (GenericType) data[--size];
        return removed;
    }

    public GenericType get(int index) {
        return (GenericType) data[index];
    }

    public void set(int index, GenericType value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomGenericArrayList{ " +
                "data= " + Arrays.toString(data) +
                ", size= " + size + " }";
    }

    public static void main(String[] args) {

        CustomGenericArrayList<Integer> listInt = new CustomGenericArrayList<>();

        listInt.add(2);
    }

}
