package com.kunal.generics.comparing;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Comparator;

public class Student{

    int roll;
    float marks;

    public Student(int ROLL, float MARKS) {
        this.roll = ROLL;
        this.marks = MARKS;
    }

    /*@Override
    public int compareTo(@NotNull Student o) {
        System.out.println("In compareTo method of Student class.");
        int diff = (int) (this.marks - o.marks);
        return diff;
    }*/

    @Override
    public String toString() {
        return "Roll: " + this.roll + " Marks: " + this.marks;
    }

    public static void main(String[] args) {

        Student st1 = new Student(12, 96f);
        Student st2 = new Student(13,89f);
        Student st3 = new Student(14,90.0f);
        Student st4 = new Student(15,75f);
        Student st5 = new Student(16,99f);

        Student[] listStd = {st1, st2, st3, st4, st5};

        System.out.println(Arrays.toString(listStd));
//        Arrays.sort(listStd); // sorted based on marks, because we already have overridden compareTo method to compare based on marks. Its using this overriden method now
        /*Arrays.sort(listStd, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                return (int) (o1.marks - o2.marks);
                return (int) (o2.marks - o1.marks);
            }
        });*/

        Arrays.sort(listStd, (o1,o2) -> (int) (o2.marks - o1.marks));
        System.out.println(Arrays.toString(listStd));

        /*if (st1.compareTo(st2) < 0) {
            System.out.println("st2 has more marks than st1, difference = "+ Math.abs(st1.compareTo(st2)));
        }*/
    }
}
