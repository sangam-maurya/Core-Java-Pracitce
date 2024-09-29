package Collection_Fremwork;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class priority {
    public static void main(String[] args) {
        PriorityQueue pr = new PriorityQueue();
        pr.add(10);
        pr.offer(50);
        pr.offer(20);
        pr.add(40);
        pr.add(40);
    pr.offer(100);
        System.out.println(pr.poll());
        System.out.println(pr);

        Deque de = new ArrayDeque();
        de.offer(3);
        de.offer(5);
        de.offer(7);
        de.offer(9);
        de.offer(9);
        de.offer(10);
        System.out.println(de.getLast());
        System.out.println(de);
    }
}
