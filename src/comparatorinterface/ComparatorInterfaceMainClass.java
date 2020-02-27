package comparatorinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorInterfaceMainClass {

    public static void main(String args[]) {

        List<Integer> list = new ArrayList();

        list.add(102);
        list.add(1002);
        list.add(106);
        list.add(115);
        list.add(51);
        list.add(102);

       /* // Here Collection class applies sorting technique
        System.out.println("Sorting Elements");
        Collections.sort(list);
        list.forEach(i -> System.out.print(" " + i));

        System.out.println();

        System.out.println("Reverse Elements");
        Collections.reverse(list);
        list.forEach(i -> System.out.print(" " + i));

        System.out.println();*/

        // So above both are natural Sorting, now we can see how to modify behavior using comparator
        ComparatorImpl comparatorImpl = new ComparatorImpl();
        System.out.println("Custom Sort Elements");
        Collections.sort(list, comparatorImpl);
        list.forEach(i -> System.out.print(" " + i));
    }
}
