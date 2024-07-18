package Week_1.day3;
public class InsertionSort {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i-1;
            while(j>= 0&& arr[j] >key){
                arr[j+1] = arr[j--]; // same as j--

            }
            arr[j+1] = key;
        }
        
    }
    public static void main(String[] args) {
        
    }
}
