package com.kunal.properties.abstractDemo;

public class Daughter extends Parent{

    public  Daughter(int age) {
        super(age);
    }
    @Override
    void career() {
        System.out.println("I am going to be a class A Govt Officer.");
    }

    @Override
    void partner(String Pname, int age) {
        System.out.printf("I am a girl, I will marry %s at age %d", Pname, age);
    }

}
