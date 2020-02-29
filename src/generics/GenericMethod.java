package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {


    void dataTypeCheck(List<?> list1) {
        list1.add(null);

//        String str = (String) list1.get(0);

    }

    void dataTypeCheck1(List<? extends Integer> list1) {
//        list1.add(2);

//        String str = (String) list1.get(0);

    }


    void dataTypeCheck3(ArrayList<Integer> list1) {
        list1.add(null);

//        String str = (String) list1.get(0);

    }

    void dataTypeCheck4(ArrayList<String> list1) {
        list1.add(null);

//        String str = (String) list1.get(0);

    }


}
