package Week_2.Day3;

import java.util.*;

public class TwoDArray {
    static void sortbycol(int[][] arr,int col){
        Arrays.sort(arr, (a,b)-> Integer.compare(a[col],b[col]));
    }
    static void sortbyrows(int[][] arr){
        for(int i = 0 ; i < arr.length;i++){
            Arrays.sort(arr[i]);
        }
    }
    static void insert(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) { // if array isn't square then arr[0].length
                //for non symmetrical array use arr[i].length
                // System.out.println("Enter value of arr[" + i + "][" + j + "]");
                // arr[i][j] = sc.nextInt();
                arr[i][j] = num++;
            }
        }
        sc.close();
    }

    static void display2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[] search(int[][] arr , int target){
        int[] pos = {-1,-1};
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j <arr[0].length ; j++){
                if (arr[i][j] == target ){
                    pos[0] = i;
                    pos[1] = j;
                    return pos;
                }

            }
        }
        return pos;
    }

    static int[][] transpose(int[][] arr){
        int[][] nums = new int[arr[0].length][arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++ ){
                nums[j][i] = arr[i][j];
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[][] arr = new int[5][3];
        System.out.println();
        insert(arr);
        display2D(arr);
        // int[] number = search(arr, 12);
        // System.out.println(number[0]+" " + number[1]);
        System.out.println();
        int[][] number = transpose(arr);
        display2D(number);

        int[][] arr2 = {
            {2,3,4,5},
            {4,2,2,7},
            {5,4,8,25}
        };
        sortbyrows(arr2);
        display2D(arr2);
    }
}
