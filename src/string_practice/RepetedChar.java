package string_practice;

import java.util.HashSet;
import java.util.Set;

public class RepetedChar {
    public static void main(String[] args) {
        String str = "aasss";
        Set <Character> set = new HashSet<>();
            char maxChar =  ' ';
        int maxCount = 0;

        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (!set.contains(c)) {
                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == c) {
                        count++;
                    }
                }
                set.add(c);
                System.out.println(c + " repeats " + count + " times");

                if (count > maxCount) {
                    maxCount = count;
                    maxChar = c;
                }
            }
        }
        System.out.println("The character with the maximum frequency is '" + maxChar +   "' which repeats " + maxCount + " times.");

    }
}
