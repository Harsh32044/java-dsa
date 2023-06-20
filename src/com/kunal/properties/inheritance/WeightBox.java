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

    public WeightBox(WeightBox wbox) {
        super(wbox);
        //wbox is of type WeightBox, which has all the public things of Box class, so calling super(wbox) will call Box constructor
        //which will take len wid and height attributes of wbox

        this.weight = wbox.weight;
    }
}
