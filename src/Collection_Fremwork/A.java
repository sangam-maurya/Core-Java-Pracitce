package Collection_Fremwork;

import java.util.*;

public class A {
    public static void main(String[] args) {
     int arr[] = {3 ,5 ,4 ,6 , 1 , 2 , 9 , 8};
     int arr1 =0;
     for (int i = 0; i<arr.length-1; i++) {
         for (int j =i+1; j<arr.length; j++){
             if (arr[i]>arr[j]){
                 arr1 = arr[i];
                 arr[i] = arr[j];
                 arr[j] = arr1;
             }
         }
     }
        for (int a:arr){
            System.out.print(a + " ") ;
        }

        char c = 'a';
        char b = 'A';
        int a =  (int)c;
        int d =  (int)b;
        System.out.println(a);
        System.out.println(d);
    }
}
