package Week_5.Day2;

import java.util.*;

public class InfixToPostfix {
    static Stack<Character> stk;
    static String infixToPostfix(String s) {
        stk = new Stack<>();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+' ||
                    s.charAt(i) == '-' ||
                    s.charAt(i) == '*' ||
                    s.charAt(i) == '/')
                stk.push(s.charAt(i));
            else
                ans += s.charAt(i);

         
        }
        System.out.println(stk);
        return ans;
    }

    public static void main(String[] args) {
        String ques = "a+b*c";
        String ans = infixToPostfix(ques);
        System.out.println(ans);
       
        
    }
}
