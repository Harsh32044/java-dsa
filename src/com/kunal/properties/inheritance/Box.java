package com.kunal.properties.inheritance;

public class Box {

    double len;
    double wid;
    double height;

    public Box() {
        this.height = -1;
        this.len = -1;
        this.wid = -1;
    }

    public Box(double side) {
        this.height = side;
        this.len = side;
        this.wid = side;
    }

    public Box(double len, double wid, double height) {
        this.len = len;
        this.wid = wid;
        this.height = height;
    }
}
