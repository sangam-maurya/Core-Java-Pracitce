package java8Feature;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {

        D d = function::date;
        String name = d.name();
        System.out.println(name);

        Runnable run = function::ThreadClass;
        Thread thread = new Thread(run);
        thread.start();
        function f = new function();
        Runnable runnable = f::printnum;
        Thread tha = new Thread(runnable);
       tha.start();
    }


}