package com.kunal.properties.polymorphism;

public class Square extends Shapes {

    @Override
    public void area() {
        System.out.println("Square area is side*side");
    }

    static void greeting() {
        System.out.println("Hello from inside Square");
    }
}
