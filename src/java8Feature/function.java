package java8Feature;


import java.time.LocalDate;
import java.util.function.Function;


public class function{
    public static String work(){
       return "hi bro what are  you doing";
    }
    public static String date(){
        LocalDate date = LocalDate.now();
        return date.toString();
    }

    public static void ThreadClass()  {
        for (int i=0; i<10; i++){
            System.out.println(i*2);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }
    public void printnum (){
        for (int i=0; i<20; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
