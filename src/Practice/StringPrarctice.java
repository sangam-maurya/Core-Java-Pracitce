package Practice;

class  parent{
    static  String s = "parent";
    String p = "a";
    String run(){
        var s4 = "ankit :(";
        return s4;
    }
}
class  child extends  parent{
    static  String s = "child";
    String ss = "sangam";

 }

public class StringPrarctice {
    public static void main(String[] weore) {
        parent p = new child();
        String ew = p.run();
        System.out.println();
//        child ch = (child) new parent();
//        System.out.println(p.p.intern());
//        System.out.println(ch.p);
        var s1 = "sangam";
        System.out.println(s1);
    String er = p.run();
        System.out.println(er);

    }
}
