package java8Feature;

interface C {
   default   void sayHello(){
        System.out.println("Hell");
    }
}
interface Child {
   default void sayHello(){
        System.out.println("yes");

    }

}
interface  Z {
    public static  void test(){
        System.out.println("testing");
    }
    default void sayBye(){
        System.out.println("Bye Bye !");
    }
    public static void main(String[] args) {
        System.out.println("this is sangam maurya");
    }
}


public class A  {
    public static void main(String[] args) {

    }
}
