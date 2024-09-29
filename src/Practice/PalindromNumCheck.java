package Practice;

import java.util.Scanner;

public class PalindromNumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int num = sc.nextInt();
        int palNum = num;

        int rev=0;
        while(num!=0) {
            rev=rev*10 + num%10;
            num = num/10;
        }
        System.out.println(rev);
        if(palNum==rev) {
            System.out.println( palNum +" this is palindrom num ");
        } else {
            System.out.println(palNum + " this is not palindrom");


        }

        }
}
