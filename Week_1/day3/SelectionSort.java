package Week_1.day3;

public class SelectionSort {
    public static int minElement(int[] arr, int i) {
        int a = 0;
        int min = a;
        for (i = 0; i < arr.length; i++) {
            if (arr[min] > arr[i]) {
                min = i;
            }
        }
        return min;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int idx = minElement(arr, i);
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;

        }
        print(arr);

    }

    public static void main(String[] args) {
        int[] arr = { 34, 1, 0, 3, 4 };
        System.out.println(minElement(arr, 0));
        selectionSort(arr);
    }
}