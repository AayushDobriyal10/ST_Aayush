package Week_5.Day1;

import java.util.*;

public class stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stk = new Stack<>();
        // stk.push(10);
        // System.out.println("Stack : " + stk);
        // System.out.println(stk.pop());
        // System.out.print("Enter number of elements : ");
        // int n = sc.nextInt();
        // for(int i = 0 ; i < n ; i++ ){
        //     System.out.print("Enter element : ");
        //     int ele = sc.nextInt();
        //     stk.push(ele);
        // }
        // System.out.println(stk);
        while(sc.hasNextInt()){
            int element = sc.nextInt();
            stk.push(element);
        }
        System.out.println(stk);
        while(!stk.isEmpty()){
            System.out.println(stk.pop());
        }
        sc.close();
        
    }
}
