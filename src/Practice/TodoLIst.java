package Practice;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TodoLIst {
    Scanner scn = new Scanner(System.in);
    Boolean Running = true;
    ArrayList list = new ArrayList();
 public  void Task(){
     System.out.println("Choose an option ");
     System.out.println("1: Add Your Task ");
     System.out.println("2: View Your Task ");
     System.out.println("3: Remove your task");
     System.out.println("4: Exit");

     int Choise =scn.nextInt();
     while (Running){
         switch (Choise) {
             case 1:
             System.out.println("Enter your Task !");
             String task = scn.next();
             list.add(task);
             System.out.println("SuccessFully Added");
             Task();
             break;
             case 2:
                 System.out.println("yout Task");
                for(int i=0; i< list.size(); i++){
                    System.out.println( list.get(i) ) ; list.get(i) ;
                }

                 Task();
                 break;

             case 3 :
                 System.out.println("remove yout task  ");
                int taskNum = scn.nextInt();
                if (taskNum>0 && taskNum<=list.size()){
                list.remove(taskNum-1);
                    System.out.println(" take removed " + list);
                }else {
                    System.out.println("invalid choose");
                }
                Task();
                break;
             case 4:
                 Running=false;
                 System.out.println("Exiting the aplication");
    break;
             default:
                 System.out.println("Invalid Choise Choose again");
         }
     }
 }


    public static void main(String[] args) {
        TodoLIst li = new TodoLIst();
        li.Task();
    }

}
