package Threads;

import static java.lang.Thread.sleep;

class MyThread extends Thread {
    public void run() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread " + Thread.currentThread().getId() + " is running");
    }
}

public class Test {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
          sleep(1000) ;
            System.out.println("hi ");
        }
        MyThread thread = new MyThread();
        thread.start();
    }
}
