package com.kunal.generics.lambdas;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arr.add(i + 2);
        }

        Consumer<Integer> func = item -> System.out.println(item + 1);
        arr.forEach(func);

        /*Cat myCat = new Cat();
        myCat.print();
        printThing(myCat);*/
        printThing(suffix -> {
            System.out.println("Meoww "+ suffix);
            return "Meow";
        });

    }

    static void printThing(Printable thing) {
       String st = thing.print("!");
        System.out.println("Using the return value of thing() " + st);
    }
}
