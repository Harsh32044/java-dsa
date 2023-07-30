package com.kunal.actualcollections;

import java.util.*;

public class SetAndHashSet {

    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();
        set.add("Harsh");
        set.add("Cillian");
        set.add("June");
        set.add("Jeff");
        set.add("Jean-Paul");
        set.add("Oppenheimer");

//        set.remove(0);

        System.out.println(set.size());
        System.out.println(set.contains("Hars"));

        set.forEach(elem -> System.out.println(elem.concat("!!")));

        for (String s : set) {
            System.out.println(s);
        }

//        System.out.println(set);
    }
}
