package Week_1.Day4;

public class SubArrays {
    // generate sub array
    public static void generateSubArray(int[] arr) {
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i ; j < arr.length ; j++){
                for(int k = i ; k <= j ; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }

        }
    }
    // generate sub array sum
    public static void generateSubArraySum(int[] arr) {
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i ; j < arr.length ; j++){
                int sum = 0;
                for(int k = i ; k <= j ; k++){
                    sum += arr[k];
                    System.out.println("sum is : " + sum);
                }
                System.out.println();
            }
        }
    }
    // generate max sub array sum
    public static void generateMaxSubArraySum(int[] arr) {
        int maxsum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i ; j < arr.length ; j++){
                int sum = Integer.MIN_VALUE;
                for(int k = i ; k <= j ; k++){
                    sum += arr[k];
                    System.out.println("sum is : " + sum);
                }
                maxsum = Math.max(sum, maxsum);
                System.out.println();
            }
        }
        System.out.println(maxsum);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        generateSubArray(arr);
        generateSubArraySum(arr);
        generateMaxSubArraySum(arr);
    }
}
