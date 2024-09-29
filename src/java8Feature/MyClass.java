package java8Feature;

public class MyClass {
    public static void main(String[] args) {
  D a1 = new D(){
      int x =10;
    public  String name(){
        System.out.println(this.x);
        return "sangam";
    }
  };
  System.out.println(a1.name());
    int x =20;
      D a2 = ()-> "saurbah";
        System.out.println(x);
        System.out.println(a2.name());
}
}
