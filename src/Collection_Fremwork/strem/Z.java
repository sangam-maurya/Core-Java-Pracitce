package Collection_Fremwork.strem;

@FunctionalInterface
   interface  X {
   public void name();
  default public  void name1(){
      System.out.println("vicky is  fuck mind ");
  }
}

abstract class T{
   abstract public String name();
   abstract public String animal();
   void cat(){
       System.out.println("cat doing mew mew");
   }
   abstract public void child();
}

class F extends T{

    @Override
    public String name() {
        return "maurya sangam";
    }

    @Override
    public String animal() {
        return "Cat";
    }

    @Override
    public void child() {
        System.out.println("Bacccha Rota haai");
    }
}

public class Z implements X{
    public static void main(String[] args) {
       int a =4;
       boolean isEven = a%2==0? false : false;
        System.out.println(isEven);
       Z a1 = new Z();
       a1.name();
    }

    @Override
    public void name() {
        System.out.println("raja is good boy");
        X.super.name1();
    }

//    @Override
//    public String name1() {
//        return X.super.name1();
//    }
}
