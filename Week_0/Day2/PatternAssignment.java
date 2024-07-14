package Day2;

public class PatternAssignment {
    public static void main(String[] args) {

        int n = 5;
        // STAR PATTERNS

        // Question 1
        System.out.println("Question 1");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Question 2
        System.out.println("Question 2");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Question 3
        System.out.println("Question 3");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Question 4
        System.out.println("Question 4");
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Question 5
        System.out.println("Question 5");
        for (int i = n; i >= 1; i--) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Question 6
        System.out.println("Question 6");
        for (int i = n; i >= 1; i--) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("    ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Question 7
        System.out.println("Question 7");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // Question 8
        System.out.println("Question 8");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || (i + j) == n + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // Question 9
        System.out.println("Question 9");
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Question 10
        System.out.println("Question 10");
        for (int i = n; i >= 1; i--) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Question 11
        System.out.println("Question 11");
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                if (j < i) {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        // Question 12
        System.out.println("Question 12");
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                if (j < i) {
                    System.out.print("! ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // Question 13
        System.out.println("Question 13");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Question 14
        System.out.println("Question 14");
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Question 15
        System.out.println("Question 15");
        for (int i = n; i >= 1; i--) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("    ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("    ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Question 16
        System.out.println("Question 16");
        for (int i = n; i >= 1; i--) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        
         // Question 17
         int s = 7;
        System.out.println("Question 17");
        for (int i = s-4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= (s-i-3); k++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (s-i-3); k++) {
                System.out.print("  ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        
        for (int i = 1; i <= s-4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= (s - i-3); k++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (s - i-3); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        } 

        // Question 18
        System.out.println("Question 18");
        for (int i = 1; i <= s-4; i++) {
            for (int k = 1; k <= (s - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = s-3; i >= 1; i--) {
            for (int k = 1; k <= (s - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        
    }
}