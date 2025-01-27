package Threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter2 {
     private int count =0;
     private Lock lock = new ReentrantLock();

     public void increment(){
         lock.lock();
         try{
             count++;
             System.out.println("count after increment " + count);
         }finally {
             lock.unlock();
         }
     }
     public int getCount(){
         return count;
     }
}


public class multi {
    public static void main(String[] args) {
        Counter2 counter2 = new Counter2();
        Thread thread = new Thread(()->{
            for (int i=0; i<10; i++){
                counter2.increment();
                try{
                    Thread.sleep(100);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        Thread t2= new Thread(()-> {
            for (int i=0; i<5; i++){
                counter2.increment();
                try {
                    Thread.sleep(100);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        t2.start();
    }
}
