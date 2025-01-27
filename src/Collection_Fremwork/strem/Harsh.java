package Collection_Fremwork.strem;
import java.util.*;
import java.util.stream.Collectors;

public class Harsh {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple" , "Banana" , "Apple");

        // Poore list ko ek String mein convert karte hain
        String combinedString = String.join("", list).toLowerCase(); // Sabhi ko lowercase mein karte hain

        // Har character ki frequency count karte hain
        Map<Character, Long> frequencyMap = combinedString.chars()
                .mapToObj(c -> (char) c) // IntStream ko CharStream mein badalte hain
                .collect(Collectors.groupingBy(c -> c, Collectors.counting())); // Group kar ke counting karte hain

//         Frequency ko format karte hain aur print karte hain
        String result = frequencyMap.entrySet().stream()
                .map(entry -> entry.getKey() + "=" + entry.getValue()) // "key=value" format banate hain
                .collect(Collectors.joining(", ")); // Join kar ke ek String banate hain

        System.out.println("Character frequencies: " + frequencyMap);
        System.out.println("result is  " +  result);
    }
}
