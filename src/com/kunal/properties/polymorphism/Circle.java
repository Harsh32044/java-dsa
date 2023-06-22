package com.kunal.properties.polymorphism;

public class Circle extends Shapes{

    public double radius;
    @Override
    public void area() {
        System.out.println("Circle area is Math.PI * radius * radius");
    }

    static void greeting() {
        System.out.println("Hello from inside Circle");
    }
}
