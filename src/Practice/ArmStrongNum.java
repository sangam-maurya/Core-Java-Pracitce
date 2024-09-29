package Practice;

import java.util.Scanner;

public class ArmStrongNum {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        int armStrong= num;
        int ln = String.valueOf(num).length();
        int sum=0;
        while (num>0){
             int n=num%10;
             num=num/10;
             sum += Math.pow(n , ln);
        }
        if (armStrong==sum){
            System.out.println("This is armstrong num " + armStrong);
        }else{
            System.out.println("this is not armstrong num " + sum);
        }
        System.out.println(Math.pow(5 , 3));
    }
}