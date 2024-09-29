package Collection_Fremwork;

import java.util.*;

public class LinkLiat {
    public static void main(String[] args) {

    ArrayList  list = new ArrayList();
    list.add(10);
    list.add(50);
    list.add("sangam");
    list.add(80);
    list.add(1 , 20);

   Vector vc = new Vector();
   vc.add(0 , 4);
   vc.add(5);
   vc.add("saurabh");

   Stack st = new Stack();
   st.push(3) ;
   st.push(5);
   st.push("sa");
   st.push(4);
   st.push(7);

        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.stream());
    }
}
