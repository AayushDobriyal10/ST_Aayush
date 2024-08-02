package Week_3.Day4;

public class wrapperclass {
    static String subString(String s){
        for(int i = 0 ; i <s.length() ; i++){
            for(int j = i+1 ; j <= s.length() ; j++){
                System.out.println(s.substring(i, j));
            }
        }
        return s;
    }
    public static void main(String[] args) {

        int x = 30;
        Integer num = x; // Autoboxing
        int z = num; // Unboxing
        System.out.println(z);

        String s = "abcde";
        System.out.println(subString(s));
        
        

    }
}
