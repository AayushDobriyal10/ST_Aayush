import java.util.*;
public class array2 {
    // Sum of an Array
    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Search an element in our Array
    public static int searchElement(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n)
                return i;
        }
        return -1;
    }

    // Swap 
    public static void swap(int[] array ,int i, int j) {
        int  temp=array[i];
        array[i] = array[j];
        array[j] = temp;
        
    }
    public static void print(int[] array){
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i] + " ");
        }
    }
    // Create a function of reverse an array 

    // first original method
    public static void reverseArray(int[] arr){
        int length = arr.length;
        for(int i = 0 ; i < length/2 ; i++){
            int temp = arr[i];
            arr[i] = arr[length-i-1];
            arr[length-i-1]=temp;
        }
        print(arr);
    }
    
    // Second method 
    public static void revArray(int[] arr){
        int i = 0 , j = arr.length;
        while(j<i){
            swap(arr, i, j);
            i++;j++;
        }
        print(arr);
    }

    public static int maxElement(int[] arr){
        int max = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if (max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Value: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to search : ");
        int x = sc.nextInt();
        // System.out.println("Sum of Array is " + sumOfArray(arr));
        System.out.println("Index of element is : " + searchElement(arr, x));
        
        sc.close();

        int[] arr2 = new int[4];
        arr2[0]=1;
        arr2[1]=5;
        arr2[2]=3;
        arr2[3]=4;
        print(arr2);
        System.out.println();
        reverseArray(arr2);
        System.out.println();
        System.out.println("Maximum element is : "+maxElement(arr2));
        print(arr2);
        System.out.println();
        revArray(arr2);
       
    }
}
