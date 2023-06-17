package com.kunal;

public class Main {

    public static void main(String[] args) {
        Human rh = new Human(25,"Rahul",4000000,false);
        Human hs = new Human(24,"ABC",4000000,true);
        Human hc = new Human(25,"XYZ",5000000,true);

        hs.gettingMarried(hc);

        System.out.println(hs.married);
        System.out.println(hc.married);
        // Don't access static variable via objects, access via class name
        // Static methods and variables
        //Can't use anything non-static inside a static method
        System.out.println(Human.population);
    }

}
