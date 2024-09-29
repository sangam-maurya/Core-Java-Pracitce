package string_practice;

public class ReplaceChar {
    public static void main(String[] args) {
        String[] str = {"s", "f", "s", "r", "a", "e", "q", "r", "e", "z", "x", "r"};
        String placeholder = "_";

        for (int i = 0; i < str.length; i++) {
            // Check if the current element is a duplicate
            if (str[i] != null && str[i] != placeholder) {
                for (int j = i + 1; j < str.length; j++) {
                    if (str[i].equals(str[j])) {
                        // Replace duplicate with placeholder
                        str[j] = placeholder;
                    }
                }
            }
        }

        // Print the modified array
        for (String s : str) {
            System.out.print(s + " ");
        }
    }
}
