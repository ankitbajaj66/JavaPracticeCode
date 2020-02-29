package collectiondemo;

import comparatorinterface.sortingonpojoobject.Customer;
import markerinterface.Employee;

import java.util.*;

public class ListExampleMainClass {

    public static void main(String args[]) {

//Extra mthod that ArrayList contains
//        trimToSize();
        //ensureCapacity()

      /*  ArrayList al = new ArrayList();
        List l = new ArrayList();


        // LinkedList
        LinkedList linkedList = new LinkedList();
        linkedList.remove();
        linkedList.getFirst();

        l.add(0, 1);
        l.add(1, 2);
        l.add(2, 3);
        l.add(3, 100);


        System.out.println("Retrived Element: " + l.get(0));
        System.out.println("Removed Element: " + l.remove(0));
        System.out.println("Set Element: " + l.set(0, 100));
        System.out.println("Index of Element: " + l.indexOf(100));
        System.out.println("Last Index of Element: " + l.lastIndexOf(100));

        System.out.println("Retrived Element using loop");
        for (Object ll : l) {
            System.out.println(ll);
        }

        System.out.println("Retrived Element using List Iterator and remove choice item");
        Iterator iterator = l.listIterator();
        Integer i = null;
        while (iterator.hasNext()) {
            if (i!= null)
            i = (Integer) iterator.next();
            if (i == 3) {
                iterator.remove();
                System.out.println(i+" Removed");
            }
        }
*/

        Vector vec = new Vector();
        vec.add(4);
        vec.add(1);
        vec.add(3);
        vec.add(9);
        vec.add(6);
        vec.add(8);

        System.out.println("The Vector elements are: ");
        Iterator i = vec.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }


        TreeSet treeSet = new TreeSet();
        treeSet.add(new Customer("Ankit", 1));
        treeSet.add(new Customer("A", 12));
        treeSet.add(new Customer("B", 11));
        treeSet.add(new Customer("C", 5));

        System.out.println(treeSet);

    }
}
