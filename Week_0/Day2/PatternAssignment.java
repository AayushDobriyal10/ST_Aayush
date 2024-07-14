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
            for (int k = 2; k <= i; k++) {
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
        for (int i = s - 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= (s - i - 3); k++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (s - i - 3); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= s - 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= (s - i - 3); k++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (s - i - 3); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Question 18
        System.out.println("Question 18");
        for (int i = 1; i <= s - 4; i++) {
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
        for (int i = s - 3; i >= 1; i--) {
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

        // Question 19
        System.out.println("Question 19");
        System.out.println("Not solved");
        for (int i = s - 3; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= (s - i - 3); k++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (s - i - 3); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i <= s - 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= (s - i - 3); k++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (s - i - 3); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Question 20
        System.out.println("Question 20");
        for (int i = s - 3; i >= 1; i--) {
            for (int j = 1; j <= s; j++) {
                if (i == j || (i + j) == s + 1) {
                    System.out.print("* ");

                } else {
                    System.out.print("  ");

                }

            }
            System.out.println();
        }

        for (int i = 2; i <= s - 3; i++) {
            for (int j = 1; j <= s; j++) {
                if (i == j || (i + j) == s + 1) {
                    System.out.print("* ");

                } else {
                    System.out.print("  ");

                }

            }
            System.out.println();

        }

        System.out.println();

        // Question 21
        System.out.println("Question 21");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= (n - i - 1); k++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i && j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Question 22
        System.out.println("Question 22");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= (n - i - 1); k++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i && j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Question 23
        System.out.println("Question 23");
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("1 ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("1 ");
            }
            System.out.println();
        }

        System.out.println();

        // Question 24
        System.out.println("Question 24");
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Question 25
        System.out.println("Question 25");
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("   ");
            }

            for (int j = 1; j <= i; j++) {
                if (count < 10) {
                    System.out.print(count + "  ");
                } else {
                    System.out.print(count + " ");
                }
                count++;
            }

            for (int j = 1; j <= i - 1; j++) {
                if (count < 10) {
                    System.out.print(count + "  ");
                } else {
                    System.out.print(count + " ");
                }

                count++;
            }
            System.out.println();

        }

        System.out.println();

        // Question 26
        System.out.println("Question 26");
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        System.out.println();

        // Question 27
        System.out.println("Question 27");
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");

            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        System.out.println();

        // Question 28
        System.out.println("Question 28");
        for (int i = 1; i <= n; i++) {
            int num = i;
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");

                num++;
            }
            num -= 2;
            for (int j = 2; j <= i; j++) {
                System.out.print(num + " ");
                num--;
            }
            System.out.println();
        }

        System.out.println();

        // Question 29
        System.out.println("Question 29");
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            for (int j = 2; j <= i; j++) {
                if (j == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // Question 30
        System.out.println("Question 30");
        for (int i = 1; i <= n; i++) {
            int ct = 5;
            for (int j = 1; j <= n; j++) {
                System.out.print(ct + " ");
                ct--;
            }
            System.out.println();
        }

        System.out.println();

        // Question 31
        System.out.println("Question 31");
        for (int i = 1; i <= n; i++) {
            int ct = 5;
            for (int j = 1; j <= n; j++) {
                if (i + j == n + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(ct + " ");
                    ct--;
                }
            }
            System.out.println();
        }

        System.out.println();

        // Question 32
        System.out.println("Question 32");
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= 2*i-1; j++){
                if( j%2==0){
                    System.out.print("* ");
                }
                else{
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
            for(int i = n-1 ; i >= 1 ; i--){
                for(int j = 1 ; j <= 2*i-1 ; j++){
                    if(j%2==0){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            }
        
            System.out.println();

        // Question 33
        System.out.println("Question 33");
        for (int i = 1; i <= 2 * n; i++) {
            int cout = (2 * n) - i + 1;
            for (int k = 1; k <= (2 * n - i); k++) {
                System.out.print("  ");

            }
            for (int j = i; j >= 1; j--) {
                if (cout == 10) {
                    System.out.print("0 ");
                } else {
                    System.out.print(cout + " ");
                    cout++;
                }
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(cout - 1 + " ");
                cout--;
            }
            System.out.println();
        }
    }
}