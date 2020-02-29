package collectiondemo;

import java.util.*;

public class ArrayDemoMainClass {

    public static void main(String args[]) {
/*
        // Array
        Integer[] arr = new Integer[100];
        arr[1] = 2;
        System.out.println(arr[0]);*/

//        List l = new ArrayList();
        Collection c = new ArrayList();
        c.add(1);
        c.add(5);
        c.add(0);
        c.add(8);
        c.add(1);
        c.add(2);
        System.out.println("Collection output");
        for (Object cc : c) {
            System.out.println(cc);
        }

        System.out.println();
        System.out.println("List output");
        List l = new ArrayList();
        l.add(1);
        l.add(5);
        l.add(0);
        l.add(8);
        l.add(1);
        l.add(2);
        for (Object ll : l) {
            System.out.println(ll);
        }

        System.out.println();
        System.out.println("Set output");
        Set s = new HashSet();
        s.add(1);
        s.add(5);
        s.add(0);
        s.add(8);
        s.add(1);
        s.add(2);
        for (Object ss : s) {
            System.out.println(ss);
        }

        // Gets Synchronized List
        List synchronizedList = Collections.synchronizedList(l);

        Set sss = new HashSet();
        sss.add(null);
        sss.add(null);
        sss.add(null);

        System.out.println();
        System.out.println("Hash Set output");
        for (Object ss : sss) {
            System.out.println(ss);
        }

        String s1 = new String("B");
        String s2 = new String("B");

        if(s1.hashCode() == s2.hashCode())
        {
            System.out.println("Both Hashcode equals");
        }
        else
        {
            System.out.println("Both Hashcode not equals");
        }

        Integer i1 = new Integer(2);
        Integer i2 = new Integer(3);

        if(i1.hashCode() == i2.hashCode())
        {
            System.out.println("Both Integher Hashcode equals");
        }
        else
        {
            System.out.println("Both Integher Hashcode not equals");
        }


    }



}
