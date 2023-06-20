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
}
