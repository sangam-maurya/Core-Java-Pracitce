package Collection_Fremwork;

import java.util.Stack;
import java.util.Vector;

public class StackFrem {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.add("ram");
        st.add(10);
        st.add("shyam");
        st.add(5);
        st.add("satyam");
        st.add(10);
        st.push( 1);
        Object pop = st.pop();
        System.out.println(pop);
        Object peek = st.peek();
        System.out.println(peek);

        String input = "Sangam";
        System.out.println(" original String "  + input);

        for (char ch:input.toCharArray()){
            st.push(ch);
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!st.isEmpty()){
            stringBuilder.append(st.pop());
        }
        System.out.println(stringBuilder);
    }
}
