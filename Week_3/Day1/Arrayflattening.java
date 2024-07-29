package Week_3.Day1;

import java.util.Arrays;

public class Arrayflattening {

    static void print(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void print2D(int[][] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[] flatArray(int[][] arr) {
        int[] flat = new int[arr.length*arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                flat[arr[0].length * i + j] = arr[i][j];
            }
        }
        return flat;
    }
    static int[][] fillArray(int[][] arr , int[] nums){
        for( int i = 0 ; i < nums.length ; i++){
            arr[i/arr[0].length][i%arr[0].length] = nums[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {4,8,24},
            {6,2,86},
            {7,53,9}
        };
        
        int[] nums = flatArray(arr);
        Arrays.sort(nums);
        print(nums);
        System.out.println();
        print2D(fillArray(arr, nums));
        
    }
}
