public class array {
    //display array
    public static void displayArray(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    //check whether number is prime or not 
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        else{
            for(int i = 2 ; i < n ; i++){
                if(n%i==0)
                    return false;
            }
        }
        return true;
    }
    // reverse a given integer
    public static int reverseInteger(int n){
        int temp = 0;
        while (n!=0) {
            temp = temp*10 + n%10;
            n/=10;
        }
        return temp;
    }
    //to return the count 
    public static int numCount(int n ){
        int temp = n;
        int count = 0;
        while(temp!=0){
        temp/=10;
        count++;
        }
        return count;
    }
    // check whether given number is armstrong or not
    public static boolean isArmstrong(int n){
        int d = numCount(n);
        int temp = n;
        int sum = 0;
        while(n!=0){
            sum += Math.pow((n%10), d);
            n/=10;
        }
        return( sum == temp);

    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[1] = 1;
        arr[3] = 1;
        arr[5] = 1;
        arr[7] = 1;
        arr[9] = 1;
        System.out.println(arr);
        char[] ch = new char[10];
        ch[1]='a';
        ch[2]='b';
        ch[3]='c';
        System.out.println(ch);
        displayArray(arr);
        System.out.println(isPrime(18));
        System.out.println(reverseInteger(35254));
        System.out.println(numCount(371));
        System.out.println(isArmstrong(407));

        // implicit type casting
        int n = 10;
        double d = 10.01;
        // n=n+d this will throw error
        n+=d;  //  implicit casting
         char a = 'A';
         int character = a;
         System.out.println(character);
        System.out.println(n);
        // explicit type casting
}
}
