package Practice;

import java.util.Scanner;

public class AtmMashine {

    private int pin =7318;
   private   double Balance =5000;
    Scanner sc = new Scanner(System.in);
    int user;
    public void atm(){
        for (int i=1; i<=3; i++) {

            System.out.println("Enter you password");
            user = sc.nextInt();

            if (user == pin) {
                Menu();
                return;
            } else {
                System.out.println("invalid password try again");
            }
        }
    if(user!=pin){
        System.out.println("Thanks For Comming");
    }
    }
    private void Menu(){
        System.out.println("Choose An Option");
        System.out.println("1: Check Balance ");
        System.out.println("2: Deposit Money ");
        System.out.println("3: withdrawal Money");
        System.out.println("4: Exit");

        int user =sc.nextInt();
        switch (user){
            case 1:
                System.out.println("this is your balance " + Balance);
                Menu();
                break;
            case 2:
                System.out.println("Enter yout Deposit Money");
                 user =sc.nextInt();
                 Balance = user + Balance;
                System.out.println("SuccessFully Deposit");
                Menu();
                break;
            case 3:
                System.out.println("Enter your Ammount");
                user=sc.nextInt();
                Balance = Balance-user ;
                System.out.println("Successfully withdrawal Mony " + user);
                System.out.println("your Balance is " + Balance);
                Menu();
                break;
            case 4:
                System.out.println("Thanks For Comming ");
                break;
            default:
                System.out.println("Invalid Option Choose Again");
                Menu();
        }


    }


}
