package Threads;

class B extends Thread{
   public void run() {
       try {
           Thread.sleep(100);
       }catch (Exception e){
           e.printStackTrace();
       }
       for (int i=0; i<=100; i++){
           System.out.println(i*2);
       }
   }
   public void name(){
       for (int i=0; i<100; i++){

           System.out.println("second thread -> " + " 2 ");
       }
   }
}


public class A {
    public static void main(String[] args) {
        for (int i=0; i<100; i++){
            try {
                Thread.sleep(100);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("third thread  -> "  + " 3 ");
        }
       B b = new B();
        b.start();
    }
}
