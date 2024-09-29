package Threads;

public class Main {
    public static void main(String[] args) {
       Balance bl = new Balance();
       Runnable task = new Runnable() {
           @Override
           public void run() {
               bl.withdrw(20);
           }
       };
       Thread t1 = new Thread(task , "thread 1" );
       t1.start();
       Thread t2 = new Thread(task   , "thread 2 ");
       t2.start();
    }
}
