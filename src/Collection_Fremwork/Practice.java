package Collection_Fremwork;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(5);
        li.add(10);
        li.add(2);
        li.add(4);
        li.add(1);
        li.add(8);
        li.add(12);
        li.add(9);
        Collections.sort(li , (a , b) -> b -a);
        List <Integer> vc = new Vector<>();
       vc.add(15);
       vc.add(75);
       vc.add(40);
       vc.add(30);
       vc.add(50);
       vc.add(20);
       vc.addAll(li);
       Collections.sort (vc , (a , b) -> b-a);
        System.out.println(vc);
    }
}
