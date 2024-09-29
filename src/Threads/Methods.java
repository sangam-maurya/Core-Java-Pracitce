package Threads;

import java.util.ArrayList;
import java.util.Iterator;

public class Methods extends  Thread {
    String name ;
    public Methods(String name){
        this.name = name;
    }
    public void run(){
        for (int i=0 ; i<10; i++){
           try {
                sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();   ;
            }
            System.out.println(this.name + Thread.currentThread().getName());
        }
   }
    public static void main(String[] args) throws InterruptedException {

        Methods a1 = new Methods("XXX : ");
        a1.run();
        Methods a2 = new Methods("YYY :");
        a2.run();
        for (int i = 0; i <= 10 + 1; i++) {

            Thread.currentThread().setPriority(1);
            Thread.currentThread().getPriority();
            sleep(500);
            System.out.println("Secend thred : ");
        }
    }
}
