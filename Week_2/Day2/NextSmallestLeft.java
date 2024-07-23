package Week_2.Day2;

public class NextSmallestLeft {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // NEXT SMALLEST LEFT not included
    public static void nextSmallestLeft(int[] arr, int[] nsl) {
        int minL = 100;
        for (int i = 0; i < arr.length ; i++) {
            nsl[i] = minL; // store
            minL = Math.min(minL, arr[i]); // update
        }

        print(nsl);
    }
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 8, 7, 3, 4 };
        int[] nsl = new int[arr.length];
        nextSmallestLeft(arr, nsl);
    }
}
