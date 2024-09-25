package Week_6.Day1;

public class LinkedList {
    class Node {
        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    public int size() {
        return size;
    }

    // Adding elements in LinkedList

    public void addFirst(int item) {
        Node nn = new Node();
        nn.data = item;
        if (size == 0) {
            head = nn;
            tail = nn;
        } else {
            nn.next = head;
            head = nn;
        }
        size++;
    }

    public void addLast(int item) {
        if (size == 0)
            addFirst(item);
        else {
            Node nn = new Node();
            nn.data = item;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    public Node getNode(int index) {
        if (index < 0 || index >= size)
            return null;

        Node temp = head;
        for (int i = 0; i <= index - 1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void addAtIndex(int item, int index) {
        if (index == 0)
            addFirst(item);
        else if (index == size)
            addLast(item);
        else {
            Node nn = new Node();
            nn.data = item;
            Node k_1th = getNode(index - 1); // k-1 th node
            nn.next = k_1th.next;
            k_1th.next = nn;
            size++;
        }
    }

    // Fetching element data in LinkedList

    public int getStart() {
        return head.data;
    }

    public int getEnd() {
        return tail.data;
    }

    public int getIndex(int index) {
        if (index == 0)
            return getStart();
        else if (index == size - 1)
            return getEnd();
        else
            return getNode(index).data;
    }

    // Removing elements in LinkedList
    public int removeFirst() {
        int rn = head.data;
        if (size == 1) {
            head = null;
            tail = null;
        }
        else{
            Node temp = head;
            head = head.next;
            temp.next = null;
        }
        size--;
        return rn;
    }
    public int removeLast(){
        if(size==1)
            return removeFirst();
        else{
            int rn = tail.data;
            Node sl = getNode(size-2);
            sl.next = null;
            tail = sl;
            size--;
            return rn;
        }

    }

    public int removeAtIndex(int index){
        if(index==0)
            return removeFirst();
        else if(index==size-1)
            return removeLast();
        else{
            Node k_1th = getNode(index-1);
            Node temp = k_1th.next;
            int rn = temp.data;
            temp.next= null;
            size--;
            return rn;
        }
    }
}
