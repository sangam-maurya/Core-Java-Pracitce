package Collection_Fremwork;

public class Patern {

    public static void main(String[] args) {
//        int n=5;
//        for (int i=1; i<=n; i++) {
//            for (int j=0; j<=i; j++) {
//                System.out.print(" * " + " ");
//            }
//            System.out.println(" ");
//        }
        pattern();
    }
    public static void pattern()
    {
        int n=5;
        for(int i = 1;i<n+n;i++){
            int var =i;
            for(int j = 1; j<= var; j++)
            {
                if(i<(n+n/2)-1)
                {
                    System.out.print(j+" ");
                }
                else {
                    var =n+n-i;
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
