package Collection_Fremwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        List  li = new ArrayList<>();
        li.add(10);
        li.add(20);
        li.add("ram");
        li.add(50);
        li.add(2);
        li.add("shyam");
        li.remove(1);
        li.add(2 , "saurabh");
        li.remove("saurabh");
        li.set(1 , "sangam");
        Object object = li.get(0);
        System.out.println("here i use get method " +  object);
        System.out.println("here we print list " + li);
        int size = li.size();
        System.out.println( "get list Size " + size);
//        if (li.isEmpty()){
//            System.out.println("it is null");
//        }else {
//            System.out.println(li);
//        }
        boolean sangam = li.contains("sanam");
        System.out.println(sangam);

    }
}
