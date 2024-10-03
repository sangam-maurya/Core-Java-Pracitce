package Collection_Fremwork.Loop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A {
    public static void main(String[] args) {

        int list [] = {2 , 2,  4, 6, 3, 7, 3, 7, 8, 3, 9};
        int temp =0;
        for (int i=0; i<list.length; i++){
            for (int j=0; j<list.length; j ++){
                if (list[i]<list[j]){
                    temp=list[i];
                    list[i]=list[j];
                    list[j]=temp;
                }
            }
        }
        System.out.println("Sorting the element: ");
        for (int i:list){
            System.out.print(i + " ");
        }
     int tempArr[] = new int[list.length];
        int t =0;
        tempArr[t++]=list[0];
        for (int i=1; i< list.length; i++){
            if (list[i]!=list[i-1]){
                tempArr[t++]=list[i];
            }
        }
        System.out.println();
        System.out.println("Removing Zero And Duplicate Element: " );
        for (int i=0; i<t; i++){
            System.out.print( +tempArr[i] + " ");
        }
    }
}
