package Threads;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Balance {
  private  int balance =100;

    private  final Lock lock = new ReentrantLock();

    public void withdrw (int amount){
        System.out.println(Thread.currentThread().getName() + " atemoting to the withdrwa  " + amount);

        try{
            if (lock.tryLock(1000 , TimeUnit.MILLISECONDS)){
                if (balance>=amount){
                    try {
                        System.out.println(Thread.currentThread().getName() + " proccesing withwral ");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " Completed withwral your balance is " + balance);
                    }catch (Exception e){
    e.printStackTrace();
                    }finally {
                        lock.unlock();
                    }
                    }else {
                    System.out.println(Thread.currentThread().getName() + " insufficiant Balance ");
                }
            }else {
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock  will try    latter  ");
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
