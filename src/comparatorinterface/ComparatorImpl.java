package comparatorinterface;

import java.util.Comparator;

public class ComparatorImpl implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {

//        return o1.compareTo(o2);
        if (o1 == o2)
            return 0;
        else if (o1 > o2)
            return 1;
        else
            return -1;
    }
}
