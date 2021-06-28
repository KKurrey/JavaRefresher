package com.example.lib1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraysPractice {
    public static void main(String[] args) {
        int a[] = { 10, 20, 34, 26, 12};
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[4]);

//      Array List
        ArrayList<String> list = new ArrayList<String>();
        list.add("Kranti");
        list.add("Rita");
        list.add("Kiran");
        list.add("Shubha");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ArrayList p = new ArrayList();
        p.add(3);
        p.add("1234");
        p.add(4);
        for (Object o : p){
            System.out.println("Object is: " + o);
        }
    }
}
