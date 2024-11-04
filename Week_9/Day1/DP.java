package Week_9.Day1;

public class DP {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Top down approach for DP
    public static int dpFibonacci(int n, int[] dp) {
        if (n == 0 || n == 1)
            return n;
        if (dp[n] != 0)
            return dp[n];
        return dp[n] = dpFibonacci(n - 1, dp) + dpFibonacci(n - 2, dp);
    }

    // Bottom up approach
    public static int fibonacciBU(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        // System.out.println(fibonacci(6));
        int n = 6;
        // System.out.println(dpFibonacci(n, new int[n + 1]));
        System.out.println(fibonacciBU(n));

    }
}
