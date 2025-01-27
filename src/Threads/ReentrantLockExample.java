package Threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample extends Thread {
    public void run() {
        lock.lock();
        System.out.println(Thread.currentThread().getState());
        try {
            System.out.println("outer method ");
            innerMethod();
        } finally {
            lock.unlock();
        }
    }
    private  final Lock lock = new java.util.concurrent.locks.ReentrantLock(true);


        public void innerMethod(){
            lock.lock();
            try{
                System.out.println("innerMethod");
            }finally {
                lock.unlock();
            }
        }

    public static void main(String[] args)  {
        ReentrantLock re = new ReentrantLock();
        Thread thread = new Thread();
     thread.start();
    }
}
