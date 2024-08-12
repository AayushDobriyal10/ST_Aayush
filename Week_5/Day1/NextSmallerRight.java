package Week_5.Day1;

import java.util.Stack;

public class NextSmallerRight {
    static int[] nextGreaterRight(int[] arr) {
        int[] nsr = new int[arr.length];
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stk.empty() && arr[i] > stk.peek())
                stk.pop();
            if (stk.empty())
                nsr[i] = -1;
            else
                nsr[i] = stk.peek();
            stk.push(arr[i]);

        }
        return nsr;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 3, 4, 5, 9, 2 };
        int[] nums = nextGreaterRight(arr);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}

