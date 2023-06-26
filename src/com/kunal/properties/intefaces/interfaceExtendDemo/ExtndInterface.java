package com.kunal.properties.intefaces.interfaceExtendDemo;

public class ExtndInterface implements A, B{

    @Override
    public void greet() {
        System.out.println("Good Morning from " + this.getClass());
    }
    @Override
    public void fun() {
        System.out.println("fun() in ExtndInterface class.");
    }
}
