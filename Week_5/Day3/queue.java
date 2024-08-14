package Week_5.Day3;
import java.util.*;
public class queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        System.out.println(q);
        // System.out.println(q.remove()); // throws exception when queue is empty
        // System.out.println(q.poll()); // displays element and then removes it throws null when queue is empty
        // System.out.println(q.peek()); //  throws null when queue is empty 
        // System.out.println(q);
        System.out.println(q.element()); // throws exception when queue is empty
        q.offer(70);
        System.out.println(q);
    }
}
