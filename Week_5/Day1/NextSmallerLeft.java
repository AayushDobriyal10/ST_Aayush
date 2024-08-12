package Week_5.Day1;

import java.util.Stack;

public class NextSmallerLeft {
    static int[] nextGreaterRight(int[] arr) {
        int[] nsl = new int[arr.length];
        Stack<Integer> stk = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stk.empty() && arr[i] < stk.peek())
                stk.pop();
            if (stk.empty())
                nsl[i] = -1;
            else
                nsl[i] = stk.peek();
            stk.push(arr[i]);

        }
        return nsl;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 3, 4, 5, 9, 2 };
        int[] nums = nextGreaterRight(arr);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}

