package Week_5.Day2;

import java.util.*;

public class Hashmaps {
    static void countHMap(int[] arr){
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i : arr){
            if(mp.containsKey(i)){
                mp.put(i,mp.get(i)+1);
            }
            else
                mp.put(i,1);
        }
        System.out.println(mp);
    }
    public static void main(String[] args) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int[] arr = {1,2,3,4,1,2,3,3,3,2};
        // System.out.println(arr);
        mp.put(1, 2);
        mp.put(2, 3);
        mp.put(3, 4);
        mp.put(4, 1);
        System.out.println(mp);
        mp.remove(3);
        System.out.println(mp);
        System.out.println(mp.containsKey(1));
        System.out.println(mp.get(4));
        System.out.println(mp.get(3));

        // iterate over a map
        for(Map.Entry m : mp.entrySet()){
            System.out.println("Key : " + m.getKey() + " " + "Value : " + m.getValue());
        }
        countHMap(arr);
    }
}
