package Week_4.Day3;

public class Backtracking {
    static int sum = 0;
    static void sumOfArray(int[] arr,int i){

        if(i==arr.length)
            return;
        sum+=arr[i];
        sumOfArray(arr, i+1);
    }
    static void sumOfArrayTillOP(int[] arr,int i,int k){

        if(i==arr.length)
            return;
        sum+=arr[i];
        if(sum>k){
            sum-=arr[i];
            return;
        }
        sumOfArrayTillOP(arr, i+1,k);
    }
    static boolean backtrackSumArray(int[] arr, int i, int k ){
        if(i==arr.length) return true;
        if(sum>k) return false;
        sum+=arr[i];
        if(!backtrackSumArray(arr, i+1, k)){
            sum-=arr[i];
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        // sumOfArray(arr, sum);
        // sumOfArrayTillOP(arr, 0, 30);
        backtrackSumArray(arr, 0, 30);
        System.out.println(sum);
    }
}
