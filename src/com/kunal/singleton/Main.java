package com.kunal.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
        Singleton obj4 = Singleton.getInstance();

        System.out.println(obj.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());
        System.out.println(obj4.toString());
    }
}
