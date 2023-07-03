package com.kunal.exceptions;

import java.util.Arrays;

public class ExceptionHandling {
    public static void main(String[] args) {

        try {
            int myInt = Integer.parseInt("g");
        }
        catch (NumberFormatException | NullPointerException | ArrayIndexOutOfBoundsException nfe) {
            System.out.println("Trying to convert a non numeric string to number.");
        }
        finally {
            System.out.println("This will always execute, no matter what.");
        }

        System.out.println("Even after handling exception, the flow of program continues.");

        System.out.println(printNumber());
    }

    private static int printNumber() {
        try {
            return 3;
        }
        catch (Exception e) {
            return 4;
        }
        finally {
            return 5;
        }
    }
}
