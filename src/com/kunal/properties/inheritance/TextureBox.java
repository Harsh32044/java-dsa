package com.kunal.properties.inheritance;

public class TextureBox extends WeightBox{

    public String texture;

    public TextureBox() {
        this.texture = "smooth";
    }

    public TextureBox(TextureBox oldTB) {
        super(oldTB);
        this.texture = oldTB.texture;
    }

    public TextureBox(double side, double weight, String texture) {
        super(side, weight);
        this.texture = texture;
    }
}
