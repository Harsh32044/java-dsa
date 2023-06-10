package com.kunal;

public class Main {

    public static void main(String[] args) {
        Human rh = new Human(25,"Rahul",4000000,false);
        Human hm = new Human(24,"Harsh",4000000,true);
        Human hc = new Human(25,"Harshikha",5000000,true);

        // Don't access static variable via objects, access via class name
        // Static methods and variables
        //Can't use anything non-static inside a static method
        System.out.println(Human.population);
    }

}
