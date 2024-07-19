package Week_1.Day4;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length - 1;
        k %= nums.length;
        for (int j = 0; j < k; j++) {
            int temp = nums[n];
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = temp;
        }

    }
}
public class rotateby1 {
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void rotateBy1(int[] arr) {
        int n = arr.length - 1;
        int temp = arr[n];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotateByKTimes(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        int[] arr= new int[nums.length];
        for(int i = 0 ; i < arr.length ; i++ ){
            arr[(i+k)%arr.length] = nums[i];
        }
        for(int i = 0 ; i < arr.length ; i++){
            nums[i] = arr[i];
        }
        for(int i:arr){
            System.out.print(i + " ");
        }
    }

    public static void reverse(int[] arr, int i , int j){
        // int i = 0 , j = arr.length-1;
        while(j>i){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
        print(arr);
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        rotateBy1(arr);
        System.out.println();
        rotateByKTimes(arr, 4);
        System.out.println();
        reverse(arr , 1 ,5);
    }
}
