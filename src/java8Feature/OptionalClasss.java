package java8Feature;

import java.util.Optional;

public class OptionalClasss {
    public static void main(String[] args) {
        int c =0;
       Optional<String> op = Optional.of("sangam");
       if (op.isPresent()){
           String val = op.get();
           int ln = val.length();
           System.out.println(ln);
           c++;
       }else{
           System.out.println("record is not save");
       }
        System.out.println(c);
    }
}
