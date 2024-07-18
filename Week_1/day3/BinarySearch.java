package Week_1.day3;

import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] arr , int key){
        int start = 0 , end = arr.length-1;
        while (start <= end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end = mid+1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static int binarySearchForLowerBound(int[] arr , int key){
        int start = 0 , end = arr.length-1;
        int ans=-1;
        while (start <= end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                ans = mid;
                end = mid-1;
            }
            else if(arr[mid] > key){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }

    public static int binarySearchForUpperBound(int[] arr , int key){
        int start = 0 , end = arr.length-1;
        int ans=-1;
        while (start <= end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                ans = mid;
                start = mid+1;
            }
            else if(arr[mid] > key){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Only works when array is sorted
        // use array.sort() fn to ensure
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] arr = {1,2,2,2,4,5,5,6,7,8,8,};
        System.out.println(binarySearch(array, 5));
        Arrays.sort(arr);
        System.out.println(binarySearchForLowerBound(arr, 2));
        System.out.println(binarySearchForUpperBound(arr, 2));
    }
}
