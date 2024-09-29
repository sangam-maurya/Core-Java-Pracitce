package java8Feature;

import java.util.Comparator;

public class comparator  implements  Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        return  b - a;
    }
}