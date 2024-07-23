package Week_2.Day2;

public class NextGreatestLeft {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // NEXT GREATEST LEFT not included
    public static void nextGreatestLeft(int[] arr, int[] ngl) {
        int maxL = 0;
        for (int i = 0; i < arr.length ; i++) {
            ngl[i] = maxL; // store
            maxL = Math.max(maxL, arr[i]); // update
        }

        print(ngl);
    }
    // NEXT GREATEST LEFT included
    public static void nextGreatestLeftIncluded(int[] arr, int[] ngl) {
        int maxL = 0;
        for (int i = 0; i < arr.length ; i++) {
            maxL = Math.max(maxL, arr[i]); // update
            ngl[i] = maxL; // store
        }

        print(ngl);
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,8,7,3,4};
        int[] ngl = new int[arr.length];
        nextGreatestLeft(arr, ngl);
    }

}
