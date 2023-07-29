package com.kunal.collections;

public class Main {
    public static void main(String[] args) {

       var list = new GenericList<String>();
       list.add("A");
       list.add("sfd");
       list.add("sfd");
       list.add("sfd");
       list.add("sfd");
       list.add("sfd");
       list.add("sfd");
       list.add("sfd");
       list.add("sfd");
       list.add("sfd");
       list.add("sfd");
       list.add("tyfuy");

       System.out.println(list.size());
       var iterator = list.iterator();
       for (String ignored : list) {
           System.out.println(iterator.next());
       }
    }
}
