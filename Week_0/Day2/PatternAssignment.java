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


    }
}