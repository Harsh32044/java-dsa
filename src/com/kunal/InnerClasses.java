package com.kunal;

public class InnerClasses {
   class Test {
         String name;

         public Test(String name) {
             this.name = name;
         }
    }

    public static void main(String[] args) {

       Test a = new InnerClasses().new Test("A");
//       Test b = new Test("B");
        System.out.println(a.name);
    }
}
