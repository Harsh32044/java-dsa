package com.kunal.properties.intefaces.interfaceExtendDemo;

public class Main {
    public static void main(String[] args) {
        ExtndInterface extend = new ExtndInterface();

        extend.fun();
        extend.greet();

        A.greetings();//static methods are called via the interface name only
    }
}
