package Opps;

public class Main {
    public static void main(String[] args) {
    Cat c = new Cat();
    c.Sound();
    c.Eat();
        System.out.println( c.sum(12));
        System.out.println(c.sum("Sangam"));
        System.out.println(c.sum(10 , 12));
        System.out.println(c.sum(10 , 10 ,10));
        System.out.println(c.sum("aditya" , "sangam"));
    }
}
