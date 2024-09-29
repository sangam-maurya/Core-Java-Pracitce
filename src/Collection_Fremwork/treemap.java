package Collection_Fremwork;

import java.util.Map;
import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {
        TreeMap <Integer , String> tree = new TreeMap();
        tree.put(3 , "sangam");
        tree.put(2  , "sachin");
        tree.put(4 , "saurabh");
        tree.put(1 , "khushi");
        tree.put(4 , "chhaya");

//       for (Map.Entry map:tree.entrySet()){
//           System.out.println(map.getKey() + " -> " + map.getValue());
//
//       }
//        System.out.println(tree.ceilingKey(1));
//        System.out.println(tree.ceilingEntry(2));
//        tree.clear();
//        System.out.println(tree.pollFirstEntry());
        System.out.println(tree.subMap(1,3));
    }
}
