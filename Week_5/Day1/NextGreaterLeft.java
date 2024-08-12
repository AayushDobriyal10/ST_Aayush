package Week_5.Day1;

import java.util.Stack;

public class NextGreaterLeft {
    static int[] nextGreaterRight(int[] arr) {
        int[] ngl = new int[arr.length];
        Stack<Integer> stk = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stk.empty() && arr[i] < stk.peek())
                stk.pop();
            if (stk.empty())
                ngl[i] = -1;
            else
                ngl[i] = stk.peek();
            stk.push(arr[i]);

        }
        return ngl;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 3, 4, 5, 9, 2 };
        int[] nums = nextGreaterRight(arr);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
