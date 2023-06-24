package com.kunal.properties.accessmod;

public class SubClass extends A{

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A obj = new A(324, "HH");

        int num = obj.numProt;
        int num2 = obj.numPublic;
    }
}
