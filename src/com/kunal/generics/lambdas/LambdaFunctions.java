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

      /*  Cat myCat = new Cat();
        myCat.print("calling via object of Cat class");
        printThing(myCat);*/
        Printable objLambda = name -> {
            System.out.println("Meow using Lambda as Object " +
                    name); // Treating lambdas as object
            return "Meow!";
        };

        // OR
        printThing(
                name -> {
                    System.out.println("Meow using Lambda! " +
                            name);
                    return "Meow via Lambdas!";
                }
                );


        printThing(objLambda);


    }

    static void printThing(Printable thing) {//An object of Cat class can be given as argument in printThing() method, since Cat implements Printable
        thing.print("inside printThing");

    }
}
