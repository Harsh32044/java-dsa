package JavaBasics.Inheritance;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TrickyInheritance {
    public static void main(String[] args) {

        B b = new B();

//        b.m2();

        String str1 = "abc";
        String str2 = "abc";

        System.out.println(str1 == str2);

        String str = null;
        System.out.println(str.equals("hello")); // NPE coz str is null, and toString()
        System.out.println("hello".equals(str));
        int[] arr = null;

        System.out.println(arr.length); // NPE if arr = null, if arr = {}, 0
    }
}

class A {
    int x = 10;
    public void m1() {
        System.out.printf("x: %d", x);
    }
}

class B extends A {

    int x = 20; //variable hiding
    public void m1() {
        System.out.printf("x: %d", x);
    }
}

class C {
    public void m2() {
        System.out.println("m2() from C class");
    }
}

class D extends C {

    @Override
    public void m2() throws RuntimeException {
        System.out.println("m2() from D class extending C");
    }
}