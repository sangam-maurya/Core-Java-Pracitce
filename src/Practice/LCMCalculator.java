package Practice;

import java.util.Scanner;

public class LCMCalculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your num");
        int num1= scn.nextInt();
        int num2 = scn.nextInt();
        while (num1%num2!=0){
            int res = num1%num2;
            num1=num2;
            num2=res;

        }
        int num3 = num2;
        int lcm = (num1 * num2)/num3;
        System.out.println(lcm);

    }
}
