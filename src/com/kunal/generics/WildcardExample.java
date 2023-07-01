package com.kunal.generics;

import java.util.Arrays;

public class WildcardExample<GenericType extends Number> {
    //GenericType will now be of only those classes that extend Number
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildcardExample() {
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
        return "WildcardExample{ " +
                "data= " + Arrays.toString(data) +
                ", size= " + size + " }";
    }

    public static void main(String[] args) {

//        WildcardExample<String> sdf = new WildcardExample<String>(); compile-time error
    }
}
