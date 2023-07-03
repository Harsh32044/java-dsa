package com.kunal.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedVsUnchecked {

    public static void main(String[] args) {
        readFile("myFile.txt");

        try {

        readFile2("myFile.txt");
        }
        catch (FileNotFoundException fnf) {
            System.out.println("That file doesn't exist");
        }

        try {

        printLength(null);
        print3rdElement(new int[]{1});
        }
        catch (NullPointerException npe) {
            System.out.println("Null Pointer Exceptions");
        }

    }

    private static void readFile(String fileName) {
        try {

        FileReader reader = new FileReader(fileName);
        }
        catch (FileNotFoundException fnf) {
            System.out.println("File not found");
        }

    }

    private static void readFile2(String fileName) throws FileNotFoundException{
        FileReader reader = new FileReader(fileName);
    }

    private static void printLength(String name) {
        System.out.println(name.length());
    }

    private static void print3rdElement(int[] arr) {
        System.out.println(arr[2]);
        throw new RuntimeException();
    }
}
