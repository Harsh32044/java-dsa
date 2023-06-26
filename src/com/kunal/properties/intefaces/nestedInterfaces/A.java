package com.kunal.properties.intefaces.nestedInterfaces;

public class A {
    public interface NestedInterface {
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface {

    @Override
    public boolean isOdd(int num) {
        return ! (num % 2 == 0);
    }
}

class Main {
    public static void main(String[] args) {
        B objB = new B();

        System.out.println(objB.isOdd(78));
    }
}
