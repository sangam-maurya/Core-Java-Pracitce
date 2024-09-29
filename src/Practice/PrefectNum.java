package Practice;

public class PrefectNum {


    public static void main(String[] args) {
        int n=30;
        boolean b = isPrefect(n);
        if (b){
            System.out.println("this is prefect num");
        }else{
            System.out.println("this is not");
        }

    }
    public static  boolean isPrefect(int n){
    int sum=0;
    for (int i=1; i<=n; i++){
        if (n%i==0){
            sum+=i;
        }
        if (n==sum){
            return  true;

        }

    }
      return  false;
    }
}
