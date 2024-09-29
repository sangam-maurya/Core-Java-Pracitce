package Practice;


class A {
    A() {
        System.out.println("A()");
    }
}
class B extends  A{
    B(){
        System.out.println("B()");
    }
    B(int x){
        this();
        System.out.println("B(int)");
    }
}
public class Practice {
    public static void main(String[] args) {
      new B(10);

    }
}
