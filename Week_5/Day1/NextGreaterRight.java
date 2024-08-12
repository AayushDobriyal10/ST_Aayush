package Week_5.Day1;

import java.util.Stack;

public class NextGreaterRight {
    static int[] nextGreaterRight(int[] arr) {
        int[] ngr = new int[arr.length];
        Stack<Integer> stk = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stk.empty() && arr[i] > stk.peek())
                stk.pop();
            if (stk.empty())
                ngr[i] = -1;
            else
                ngr[i] = stk.peek();
            stk.push(arr[i]);

        }
        return ngr;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 3, 4, 5, 9, 2 };
        int[] nums = nextGreaterRight(arr);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
