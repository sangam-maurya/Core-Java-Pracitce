package java8Feature.streamapiquestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order("Sangam", 1, "bihar", Arrays.asList(1500, 2500, 1200)),
                new Order("Ravi", 2, "udhisha", Arrays.asList(2000, 30000, 700)),
                new Order("Priya", 3, "noida", Arrays.asList(500, 800, 1200)),
                new Order("Anjali", 4, "surat", Arrays.asList(5000, 20000))
        );

            List<String> list = orders.stream().filter(r -> r.getItemPrices().stream().mapToInt(Integer::intValue).max().orElse(0)>15000)
                    .map( Order::getCustomerName ).toList();
            System.out.println(list);
    }
}