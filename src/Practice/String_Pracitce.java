package Practice;

import java.util.Arrays;

public class String_Pracitce {
    public static void main(String[] args) {
       int arr[]={3 ,6 ,4,5  , 3 ,7 ,10 ,7 ,5  ,9,1 ,12 ,10 ,2 ,8};
       int max = arr[0];
       for (int i=0; i<arr.length; i++){
           if (arr[i]>max){
               max=arr[i];
           }
       }
        System.out.print("this is max number " + max);

        System.out.println();
        int SecondMax=arr[0];
       for (int i=0; i<arr.length; i++){
           if (arr[i]!=max&&arr[i]>SecondMax){
               SecondMax =arr[i];
           }
       }
        System.out.print("This is SecondMax number " +SecondMax);
        System.out.println(" ");

        int min=arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.print("this is min num " + min);
        System.out.println(" ");

        int secondMin =arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i]!=min && arr[i]<secondMin){
                secondMin=arr[i];
            }
        }
        System.out.println("this is secondMin number " + secondMin);

      int a =0;
      for (int i=0; i<arr.length-1; i++){
          for (int j=0; j<arr.length-1; j++){
              if (arr[j]>arr[j+1]){
                  a=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=a;
              }
          }
      }
      int arr1[]= new int[arr.length];
      int temp=0;
      for (int j=0; j<arr.length-1; j++){
          if (arr[j]!=arr[j+1]){
              arr1[temp++]=arr[j];
          }
      }
     int tempArr [] = new int[temp];
      int t =0;
     for (int i=0; i<temp; i++){
         if (arr1[i]%2==0){
                  tempArr[t++] = arr1[i];
         }
     }
     for (int i=0; i<t; i++){
         System.out.print(tempArr[i] + " ");
     }
    }
}
