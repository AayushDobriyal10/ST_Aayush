package Week_3.Day3;


public class strings {
    static void nameby1(String name) {
        String ans = "";
        for (int i = 0; i < name.length(); i++) {
            ans += (char) (name.charAt(i) + 1);
        }
        System.out.println(ans);
    }

    static String reverse(String s) {
        String ans = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ans += s.charAt(i);
        }
        return ans;
    }

    static boolean palindrome(String s) {
        String ans = reverse(s);
        return ans.equals(s);
    }

    static String reverseWords(String s){
        String ans = "";
        String[] words = s.split(" ");
        for(int i = words.length-1 ; i >= 0 ; i--){
            ans += words[i]+" ";
        }
        return ans.trim();
    }

    //length of longest substring 
    static int longestSubString(String s){
        int max = 0;
        int count = 0 ;
        char curr = s.charAt(0);
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)==curr){
                count++;
            }
            else{
                curr = s.charAt(i);
                max = Math.max(max, count);
                count = 1;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        // String s = "Your_name";
        // String s1 = "Aayush";
        // nameby1(s1);
        // System.out.println(reverse(s1));
        // System.out.println(palindrome(s1));
        // System.out.println(palindrome("nitin"));
        // System.out.println(s1);
        String s = "Today is Thursday";
        // String b = "a";
        // System.out.println(s.compareTo(b));
        System.out.println(s.substring(0, 10));
        System.out.println(reverseWords(s));
        System.out.println(longestSubString("aaaaahgjdj"));
    }

}
