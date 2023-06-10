package com.kunal;

public class Human {
    String name;
    int age;
    int salary;
    boolean married;
    //Static Does not depend on objects
    //Static fields can have their values changed via ClassNames or Objects
    static long population;

    public Human(int umr, String naam, int salar, boolean isMarried) {
        this.name = naam;
        this.age = umr;
        this.salary = salar;
        this.married = isMarried;
        Human.population += 1; //Changing static field's value
    }


}
