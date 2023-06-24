package com.kunal.properties.abstractDemo;

public abstract class Parent {

    int childAge;

    public Parent(int age) {
        this.childAge = age;
    }
    abstract void career();
    abstract void partner(String Pname, int age);

}
