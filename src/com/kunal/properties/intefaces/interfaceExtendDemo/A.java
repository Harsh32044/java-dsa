package com.kunal.properties.intefaces.interfaceExtendDemo;

public interface A {

    default void fun() {
        System.out.println("Default fun() in A.");
    }
}
