package Collection_Fremwork;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class B {
    public static void main(String[] args) {

        String str = "aaabbbcccccdddd";
//	printChar(str);
        int arr[]= {9,8,7,6,5,4,3,2,1};
        ascending(arr);

//	descending(arr);

    }


    public static void descending(int arr[])
    {
        for(int i = 0;i<arr.length-1;i++)
        {
            for(int j = i+1;j<arr.length-i-1
                    ;j++)
            {
                if(arr[i]<arr[j])
                {
                    int var = arr[i];
                    arr[i]=arr[j];
                    arr[j]=var;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void ascending(int arr[])
    {

        int num =0;
        for(int i = 0;i<arr.length-1;i++)
        {
            for(int j = 0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                     num = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= num;
                }
            }
        }

        for(int i:arr)
        {
            System.out.print(i+" ");
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void printChar(String str)
    {
        Map<Character,Integer> map = new HashMap<Character, Integer>();

        for(int i = 0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch)+1);
            }
            else {
                map.put(ch, 1);
            }
        }

//	System.out.println(map);
        int maxCount=0;
        char ch=' ';
        for(Map.Entry<Character, Integer> mp:map.entrySet())
        {
            if(maxCount<mp.getValue())
            {
                maxCount=mp.getValue();
                ch=mp.getKey();
            }
        }
        System.out.print(ch+" = "+maxCount);
    }

}
