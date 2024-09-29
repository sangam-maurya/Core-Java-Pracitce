package Threads;

public class Practice1 extends Thread {
     String name;
    public Practice1(String name){
        this.name=name;
    }
    public void run(){
        for ( int i=0; i<10; i++){
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Thread.currentThread().setName("X:");
            System.out.println( this.name + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Practice1 pr = new Practice1("XXX :");
        pr.start();
        System.out.println( Thread.currentThread().getState());

        for (int i=0; i<10; i++){

            try {
                sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                System.out.println( "secend Thread : ");
            }

        }

    }
}
