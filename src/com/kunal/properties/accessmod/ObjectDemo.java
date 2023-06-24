package com.kunal.properties.accessmod;

public class ObjectDemo {

    int num;

    public ObjectDemo(int numbver) {
        this.num = numbver;
    }
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //returns an integer corresponding to the object, via some complex calc
    }
}
