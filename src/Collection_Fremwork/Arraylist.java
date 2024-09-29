package Collection_Fremwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList <Integer> li = new ArrayList();
        li.add(10);
        li.add(5);
        li.add(15);
        li.add(25);
        li.add(2);
        Collections.sort(li , (a ,b) ->a-b);
        System.out.println(li);

    }
}
