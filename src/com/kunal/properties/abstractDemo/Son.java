package com.kunal.properties.abstractDemo;

public class Son extends Parent{

    public Son(int age) {
        super(age);
    }
    @Override
    void career() {
        System.out.println("I am going to be a coder");
    }

    @Override
    void partner(String Pname, int age) {
        System.out.printf("I am a boy, I will marry %s at age %d", Pname, age);

    }


}
