package Week_4.Day1;

public class recursion {
    static int sumUsingTail(int n, int a) {
        if (n == 1) {
            return a + n;
        }
        return sumUsingTail(n - 1, a + n);
    }

    static int sumUsingHead(int n) {
        if (n == 1) {
            return 1;
        }
        return sumUsingHead(n - 1) + n;
    }

    static void print(int n) {
        // base case
        if (n == 10) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n + 1);
    }

    static int countEvenUsingTail(int n, int count) {
        if (n == 1) {
            return count;
        }
        if (n % 2 == 0) {
            count++;
        }
        return countEvenUsingTail(n - 1, count);
    }

    static int countEvenUsingHead(int n) {
        if (n == 1)
            return 0;
        if (n % 2 == 0)
            return 1 + countEvenUsingHead(n - 1);
        else
            return countEvenUsingHead(n - 1);
    }

    static int powerUsingHead(int base, int pow) {
        if (pow == 0)
            return 1;
        return base * powerUsingHead(base, pow - 1);
    }

    static int powerUsingTail(int base, int pow, int ans) {
        if (pow == 0)
            return ans;
        return powerUsingTail(base, pow - 1, ans * base);
    }

    static int factorialUsingHead(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorialUsingHead(n - 1);
    }

    static int factorialUsingTail(int n, int ans) {
        if (n == 0 || n == 1)
            return ans;
        return factorialUsingTail(n - 1, ans) * n;
    }

    static int fibonacciUsingHead(int n) {
        if (n == 0 || n == 1)
            return n;
        return fibonacciUsingHead(n - 1) + fibonacciUsingHead(n - 2);
    }

    static int fibonacciUsingTail(int n, int a , int b) {
        if (n == 0)
            return a;
        return fibonacciUsingTail(n-1, b , a+b);
    }

    public static void main(String[] args) {
        // int n = 1;
        // print(n);
        // int sum = sumusingtail(10, 0);
        // System.out.println(sum);
        // int sum = sumUsingHead(10);
        // System.out.println(sum);
        // System.out.println(countEvenUsingHead(10));
        // System.out.println(powerUsingTail(3, 4, 1));
        // System.out.println(factorialUsingTail(12, 1));
        // 0 1 1 2 3 5 8 13
        System.out.println(fibonacciUsingHead(7));
        System.out.println(fibonacciUsingTail(7,0,1));
    }
}
