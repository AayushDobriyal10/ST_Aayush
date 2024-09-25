package Week_6.Day1;

public class client {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(20);
        ll.addFirst(10);
        ll.addLast(100);
        ll.addLast(200);
        ll.addAtIndex(50, 3);
        ll.removeFirst();
        ll.display();
        System.out.println();
        System.out.println(ll.removeAtIndex(3));
        // System.out.println(ll.getStart());
        // System.out.println(ll.getIndex(3));
        // System.out.println(ll.getEnd());
        // System.out.println(ll.size());
    }
}
