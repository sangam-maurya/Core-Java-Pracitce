package Collection_Fremwork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {
        HashMap <Integer , String> a = new HashMap();
        a.put(4 , "A");
        a.put(2 , "B");
        a.put(5, "C");
        a.put(1, "D");
        a.put(7 ,"f");
        a.put(6 , "y");
        a.put(106 , "t");
        a.put(10 , "o");
//        System.out.println(a);
        for ( Map.Entry me: a.entrySet()){
            System.out.println(me.getKey() + " ->" + me.getValue());
        }

//      Set set = a.entrySet();
//        Iterator itr =set.iterator();
//        while (itr.hasNext()){
//           Map.Entry entry =  (Map.Entry)  itr.next();
//            System.out.println("this is key ");
//            System.out.print(entry.getKey());
//
//            System.out.println();
//            System.out.println(" this is value ");
//            System.out.println(entry.getValue());
//        }

    }
}
