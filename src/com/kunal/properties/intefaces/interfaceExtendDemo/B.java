package com.kunal.properties.intefaces.interfaceExtendDemo;

public interface B extends A{

    void greet();

    default void fun() {
        System.out.println("Default fun() in B.");
    }

    //Cannot give default impl to same method fun() in Both A and B interfaces
    // Introduces same multiple inheritance problem that interfaces wanted to solve.
}
