package Day1;

public class operator {
    public static void main(String[] args) {
        int a = 10 , b = 20 ;
        a = a+b;
        System.out.println(a);
        int sum = 0;
        for(int i = 0 ; i <=25; i++){
            sum +=i;
            System.out.print(sum + " ");
        }
        int i=0;
        while (i<15) {
            if(i%2==0 && i%7==0){
                System.out.println(i);
            }
            i++;
        }        
    }    
}
