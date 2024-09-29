package Opps;

public class Cat extends Dog {
public  int sum (int a , int b){
    return a +b;
}
    public  int sum (String name){
        return name.length();
    }
    public  int sum ( int A ){
        return A;
    }
    public  int sum (int f , int g , int h ){
    return  f + g+ h;
    }
    public  int sum(String str , String str1){
    return str.length()   +  str1.length();
    }
    @Override
    public void Eat(){
        System.out.println("Cat Eating");
        super.Eat();
    }
}
