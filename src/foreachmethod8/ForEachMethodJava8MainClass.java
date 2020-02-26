package foreachmethod8;

import java.util.Arrays;
import java.util.List;

public class ForEachMethodJava8MainClass {

    public static void main(String args[]) {

        List<Integer> list = Arrays.asList(4, 5, 6, 7, 8);

        // Normal for loop
        System.out.println("Normal For loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(" " + list.get(i));
        }
        System.out.println();


        // Enhanced for loop - in this you no need to add any condition
        System.out.println("Enhanced For loop");
        for (Integer i : list) {
            System.out.print(" " + i);
        }
        System.out.println();

        // Above both loops are external loops
        // But now java8 we have internal loops
        // forEach is internal part of collection, so it is more faster - so if data is huge then better to use internal for loop
        // Java8 forEach method - in this you no need to add any condition
        System.out.println("Java8 forEach method");
        list.forEach(i -> System.out.print(" " + i));
        System.out.println();
    }
}
