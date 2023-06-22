package com.kunal.properties.polymorphism;

public class Triangle extends Shapes {

    @Override
    public void area() {
        System.out.println("Triangle area is 1/2 *(base * height)");
    }
}
