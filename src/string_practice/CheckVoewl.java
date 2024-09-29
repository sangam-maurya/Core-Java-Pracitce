package string_practice;

import java.util.Scanner;

public class CheckVoewl {

    public  static int chec(String str ){
        str.toUpperCase();
        int count =0;

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i' ||ch=='o' || ch=='u'){
                count++;
            }
        }
        return  count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        String str = sc.next();
        System.out.println( "there are voewl num is " + chec(str));
    }
}
