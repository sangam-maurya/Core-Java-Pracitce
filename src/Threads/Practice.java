package Threads;

import static java.lang.Thread.sleep;

public class Practice implements Runnable  {
    @Override
    public synchronized void  run(){
        for (int i=0; i<10;i++) {
            StringBuffer a1 = new StringBuffer("link");
            Thread.currentThread().setName("sang");
            System.out.println(Thread.currentThread().getName() + " " +a1.replace(0, 1, "S"));
            System.out.println(Thread.currentThread().getName() + " " +a1);
            try {
                sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args)  {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String name = sc.next();
//        String str =name;
//        String str1 ="";
//        for (int i=name.length()-1; i>=0; i--){
//            str1 = str1 + name.charAt(i);
//        }
//        System.out.println(str1);
//       if (str.equals(str1)){
//           System.out.println(" this is palindrom".trim());
//       }else{
//           System.out.println("wrong");
//       }


        Practice a = new Practice();
        Thread t1 = new Thread(a);
        t1.start();

         for (int i=0; i<10; i++){
           try {
               sleep(100);
           }catch (InterruptedException e){
               e.printStackTrace();
           }
             String str = "sangam";
             System.out.println( Thread.currentThread().getName() + " " +str.replace('s', 'm'));
             System.out.println( Thread.currentThread().getName() + " " +str);
         }
    }
}
