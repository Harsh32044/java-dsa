package com.kunal.properties.inheritance;

public class Main {
    public static void main(String[] args) {

        Box b1= new Box();
        Box cube = new Box(Math.PI);
        Box rect = new Box(12.4,11.76,3.9);

        Box b5 = new WeightBox(Math.E, 11);

//        System.out.println(b5.weight);
        // Non Accessible, since b5 is itself of type Box(parent), which wants to access the object of type WeightBox(child)
        // b5 is of parent class, which doesn't know anything about members of child.
    }
}
