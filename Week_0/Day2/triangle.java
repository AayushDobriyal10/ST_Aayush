package Day2;

public class triangle {
    public static void main(String[] args) {

        int n = 5;
        // Right facing triangle pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Left facing triangle pattern
        for (int i = 1; i <= n; i++) {
            for (int k = 0; k < (n - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Inverted Right facing triangle pattern
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Inverted Left facing triangle pattern
        for (int i = n; i >= 1; i--) {
            for (int k = 0; k < (n - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // pattern
        for (int i = n; i >= 1; i--) {
            for (int k = 0; k < (n - i); k++) {
                System.out.print("    ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // double triangle Q9
        for (int i = 1; i <= n; i++) {
            for (int k = 0; k < (n - i); k++) {
                System.out.print("  ");
            }
            for (int j1 = 1; j1 < i; j1++) {
                System.out.print("* ");
            }
            for (int j2 = 1; j2 < i-1; j2++)
                System.out.print("* ");
            System.out.println();
        }
        System.out.println();
        // double triangle Q10
        for (int i = n; i >= 1; i--) {
            for (int k = 0; k < (n - i); k++) {
                System.out.print("  ");
            }
            for (int j1 = 1; j1 < i; j1++) {
                System.out.print("* ");
            }
            for (int j2 = 1; j2 < i-1; j2++)
                System.out.print("* ");
            System.out.println();
        }

        System.out.println();
        //Pattern printing Q14
        for (int i = 1; i <= n; i++) {
            for (int k = 0; k < (n - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();



        //pattern printing Q15
        for (int i = n; i >= 1; i--) {
            for (int k = 1; k <=(n - i); k++) {
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
        //pattern printing Q21
        // for(int i = 1 ; i <=n ; i++){
        //     for(int j = 1 ; j<=i ; j++){
        //         System.out.print("* ");
        //     }
        //     for(int k = 0 ; k < (n-i) ; k ++){
        //         System.out.print("  ");
        //     }
        //     for (int j = 1 ; j<=i ; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

    }
}
