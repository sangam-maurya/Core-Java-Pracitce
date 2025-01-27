package Threads;

class D {
    public synchronized void firstThread() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("First thread -> " + "!");
                Thread.sleep(1000); // 1-second delay
                notify(); // Notify second thread
                wait(); // Wait for second thread to complete its turn
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void secondThread() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Second thread -> " + "!");
                Thread.sleep(1000); // 1-second delay
                notify(); // Notify first thread
                wait(); // Wait for first thread to complete its turn
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class MyName {
    public static void main(String[] args) {
        D obj = new D();


        Thread t1 = new Thread(() -> obj.firstThread());

        // Thread for secondThread
        Thread t2 = new Thread(() -> obj.secondThread());

        t1.start();
        t2.start();

        try{
            t1.join();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println(" it will run whatever your exception come ->  finally ");
        }
        System.out.println("this is main thread  + -> main ");


            }
}
