package Week_2.Day2;

public class Trappingrain {
    public static void nextGreatestRight(int[] arr,int[] ngr) {
        int maxR = 0;
        for(int i = arr.length-1 ; i >= 0 ; i--){
            ngr[i] = maxR; //store
            maxR = Math.max(maxR, arr[i]); //update
        }
    }
    public static void nextGreatestLeft(int[] arr, int[] ngl) {
        int maxL = 0;
        for (int i = 0; i < arr.length ; i++) {
            ngl[i] = maxL; // store
            maxL = Math.max(maxL, arr[i]); // update
        }
    }
    public static int trap(int[] height) {
        int trappedwater = 0;
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        nextGreatestLeft(height, left);
        nextGreatestRight(height, right);
        for(int i = 0 ; i < height.length ; i++){
            int level = Math.min(left[i] , right[i]);
            trappedwater+= Math.max(0,level-height[i]);
        }
        return trappedwater;
    }
    public static void main(String[] args) {
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trap(height));
    }
}
