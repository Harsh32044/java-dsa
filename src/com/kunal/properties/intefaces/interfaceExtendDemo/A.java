package com.kunal.properties.intefaces.interfaceExtendDemo;

public interface A {

    static void greetings() {
        System.out.println("Static methods cannot be overridden, hence impl required");
    }

    default void fun() {
        System.out.println("Default fun() in A.");
    }
}
