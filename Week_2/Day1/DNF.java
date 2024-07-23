package Week_2.Day1;

public class DNF {
    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums, low, mid);
                low++; mid++;
            }
            else if ( nums[mid]==1){
                mid++;
            }
            else{
                swap(nums, high, mid);
                high--;
            }
        }
    }
}
