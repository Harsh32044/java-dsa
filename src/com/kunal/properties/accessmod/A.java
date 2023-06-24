package com.kunal.properties.accessmod;

public class A {

    private int num;

    protected int numProt;

    public int numPublic;
    String name;
    int[] arr;

    public int getNum() {
        //Can add some logic here and return not the actual num, but some other value
        // Useful for hiding the actual value of private member
        return this.num;
    }

    public void setNum(int numb) {
        // Can add some logic here and set or not set the value of private member num as the one passed in the argument
        // Some code wants to change the value of num via setter method, we will know who, and we may or may not change the value based on
        // our conditions
        this.num  = numb;
    }
    public A(int num, String name) {
        this.arr = new int[num];
        this.num = num;
        this.name = name;
    }
}

