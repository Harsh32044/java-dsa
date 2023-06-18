package com.kunal;

public class InnerClasses {
   static class Test {
         String name;

         public Test(String name) {
             this.name = name;
         }

         public String toString() {
             return this.getClass() + " " + this.name;
         }
    }

    public static void main(String[] args) {

       Test a = new Test("A");
//       Test b = new Test("B");
        System.out.println(a.name);

        System.out.println(a.toString());
    }
}
