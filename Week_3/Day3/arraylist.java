package Week_3.Day3;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        // ArrayList is a dynamic array it doesn't require any memory allocation during initialization
        ArrayList<Integer> arr = new ArrayList<>();
        // add an element
        arr.add(1);
        arr.add(5);
        arr.add(3);
        arr.add(2);
        arr.add(4);
        System.out.println(arr);
        // System.out.println(arr.get(0)); // displays the element at given index
        // System.out.println(arr.remove(4)); //displays the removed element
        // System.out.println(arr.set(0, 10)); //displays the original element at given index
        // arr.size(); // to display size of an arraylist
        // arr.sort(null);

        Collections.sort(arr);
        System.out.println(arr);
        
        
        
    }
}
