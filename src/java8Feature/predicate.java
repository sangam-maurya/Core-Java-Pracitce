package java8Feature;

import java.util.function.Predicate;

public class predicate {
    public static void main(String[] args) {
        Predicate<Integer> pre = x -> x>10000;
       boolean bl= pre.test(10);
        System.out.println(bl);
    }
}
