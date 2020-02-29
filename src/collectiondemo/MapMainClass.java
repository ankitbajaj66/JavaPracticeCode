package collectiondemo;

import comparatorinterface.ComparatorImpl;

import java.util.*;

public class MapMainClass {

    public static void main(String args[]) {

        Map map = new HashMap();

        // add values
        map.put("A", 10);
        map.put("B", 12);
        map.put("C", 2);
        map.put("D", 11);
        map.put("E", 19);
        map.put("F", 4);
        System.out.println(map.put("G", 8));
        System.out.println("added first null key "+map.put(null, 100));
        System.out.println("added second null key "+map.put(null, 2));

        // get value
        System.out.println("Retrived value " + map.get("A"));

        // remove value
        System.out.println("Removed value " + map.remove("A"));

        // Map Print all keys
        Set keys = map.keySet();
        Iterator iterator = keys.iterator();
        System.out.println("Map Keys Are");
        while (iterator.hasNext()) {
            System.out.print(" " + iterator.next());
        }

        // Map Print all values
        Collection values = map.values();
        Iterator valuesIterator = values.iterator();
        System.out.println();
        System.out.println("Map Values Are");
        while (valuesIterator.hasNext()) {
            System.out.print(" " + valuesIterator.next());
        }

        // Map Print all EntrySet

        Set mapEntrySet = map.entrySet();
        Iterator entrySetIterator = mapEntrySet.iterator();

        System.out.println();
        System.out.println("Map EntrySet Are");
        while (entrySetIterator.hasNext()) {
            System.out.print(" " + entrySetIterator.next());
        }


        Hashtable hashtable = new Hashtable();
        System.out.print(hashtable.put(1, 1));
        hashtable.put(2, "A");
        hashtable.put(3, "B");
        hashtable.put(4, "C");

        System.out.println();
        System.out.println("Hashtable entry Are");
        Enumeration e = hashtable.elements();
        while (e.hasMoreElements())
        {
            System.out.print(" " + e.nextElement());
        }

    }
}
