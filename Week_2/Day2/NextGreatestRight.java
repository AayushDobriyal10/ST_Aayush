package Week_2.Day2;

public class NextGreatestRight {
    public static void print(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // NEXT GREATEST RIGHT Not included
    public static void nextGreatestRight(int[] arr,int[] ngr) {
        int maxR = 0;
        for(int i = arr.length-1 ; i >= 0 ; i--){
            ngr[i] = maxR; //store
            maxR = Math.max(maxR, arr[i]); //update
        }
        print(ngr);
    }
    // NEXT GREATEST RIGHT included
    public static void nextGreatestRightIncluded(int[] arr,int[] ngr) {
        int maxR = 0;
        for(int i = arr.length-1 ; i >= 0 ; i--){
            maxR = Math.max(maxR, arr[i]); //update
            ngr[i] = maxR; //store
        }
        print(ngr);
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,8,7,3,4};
        int[] ngr = new int[arr.length];
        nextGreatestRight(arr, ngr);
    }
}
