package com.kunal.properties.polymorphism;

public class Main {

    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes sq = new Square();

        Shapes.greeting(); // Shape
        Circle.greeting(); // Circle
        Square.greeting(); // Square


        shape.greeting(); // Shape
        sq.greeting();    // Shape
        circle.greeting();// Shape
    }
}
