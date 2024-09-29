package Practice;

public class AS {
    public static void main(String[] args) {
        int arr[] = {3, 6, 3, 2, 10, 6 , 12 ,4 ,24 ,5};
        int a = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {  // Corrected the comparison to sort in ascending order
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }

      int tempArr[]= new int[arr.length];
        int t=0;
        for (int i=0; i<arr.length-1; i++){
             if (arr[i]!=arr[i+1]){
                 tempArr[t++]=arr[i];
             }
        }
        for (int i:tempArr){
            System.out.print(i + " ");
        }
    }
}
