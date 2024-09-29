package Threads;

import org.w3c.dom.ls.LSOutput;

import javax.swing.plaf.nimbus.State;

public class thread implements  Runnable {

    public void run() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("hi bro : ");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        thread t1 = new thread();
        Thread t = new Thread(t1);
        t.start();
        thread t2 = new thread();
        Thread t3 = new Thread(t2);
        t3.start();

        for (int i=0; i<10; i++){
            System.out.println("Hello World ");
        }
    }

}
