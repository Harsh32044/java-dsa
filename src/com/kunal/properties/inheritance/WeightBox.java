package com.kunal.properties.inheritance;

public class WeightBox extends Box{

    double weight;

    public WeightBox() {
        this.weight = -1;
    }

    public WeightBox(double l, double wid, double hei, double weight) {
        super(l, wid, hei);
        this.weight = weight;
    }

    public WeightBox(double side, double weight) {
        super(side);
        this.weight = weight;
    }
}
