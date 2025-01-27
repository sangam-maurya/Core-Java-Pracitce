package Threads;


class Counter1{
    private int count =0;

    public synchronized  void increment(){
        count++;
        System.out.println("count after increment " + count);
    }
    public int getCount(){
        return count;
    }
}

public class Locking {
    public static void main(String[] args) {
        Counter1 counter1 = new Counter1();
        Thread t1 =  new Thread(()->{
            for (int i=0; i<5; i++){
                counter1.increment();
                try {
                    Thread.sleep(100);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(()->{
            for (int i=0; i<5; i++){
                counter1.increment();
            }
            try {
                Thread.sleep(100);
            }catch (Exception e){
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();
    }


}
