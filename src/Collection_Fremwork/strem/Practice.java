package Collection_Fremwork.strem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {
    public static void main(String[] args) {
//
//        int arr [] = {3 ,5 ,3 ,7 ,8};
//        IntStream stream = Arrays.stream(arr);
//        List<Integer> list = stream.boxed().sorted().distinct().limit(2).skip(1)
//                .toList();
//        System.out.println(list);

        List<Integer> list1 = Stream.iterate(0, n -> n + 10).limit(10).toList();
        System.out.println(list1);
    }

}
