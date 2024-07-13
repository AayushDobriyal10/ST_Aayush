package Day2;

import java.util.*;

public class pattern {
    public static void main(String[] args) {
        // hollow square
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();








        // Question 11
        System.out.println("Question 11");
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                if ((i + j) == n + 2 || (i+j) == 9) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
