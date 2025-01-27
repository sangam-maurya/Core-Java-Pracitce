package Collection_Fremwork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {
        Map<Integer, String> a = new HashMap();
        a.put(4, "A");
        a.put(2, "B");
        a.put(5, "C");
        a.put(18 , "C");
        a.put(1, "D");
        a.put(7, "f");
        a.put(6, "y");
        a.put(106, "t");
        a.put(10, "o");
        System.out.println(a);
        for (Map.Entry me : a.entrySet()) {
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


//        Map<String , Integer> m = new  HashMap<>();

//        m.put("7318383616" , 2258);
//        m.put("7318383616" , 2558);
//        m.put("7318383696" , 2158);
//        m.put("7318384616" , 2158);
////        System.out.println(m);
//        System.out.println(m.remove("7318383616"));
//    }

    }
}
