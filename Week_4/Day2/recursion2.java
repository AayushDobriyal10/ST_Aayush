package Week_4.Day2;

public class recursion2 {
    static void coinToss(int n, String ans) {
        if (n == 0)
            System.out.println(ans);
        else {
            coinToss(n - 1, ans + "H ");
            coinToss(n - 1, ans + "T ");
        }
    }

    static void subSequence(String Ques, String ans) {
        if (Ques.isEmpty())
            System.out.println(ans);
        else {
            subSequence(Ques.substring(1, Ques.length()), ans + Ques.substring(0, 1));
            subSequence(Ques.substring(1, Ques.length()), ans);
        }
    }

    static int countSubSequence(String Ques) {
        if (Ques.isEmpty())
            return 1;
        else {
            int num1 = countSubSequence(Ques.substring(1));
            // int num2 = countSubSequence(Ques.substring(1));
            return 2 * num1;
        }
    }

    static void validParanthesis(int n, int l, int r, String ans) {
        if (n == l && n == r) {
            System.out.println(ans);
            return;
        }
        if (l > n || r > l) {
            return;
        }
        validParanthesis(n, l+1, r, ans+"{");
        validParanthesis(n, l, r+1, ans+"}");
    }

    public static void main(String[] args) {
        // System.out.println(countSubSequence("TAP"));
        validParanthesis(3, 0, 0, "");
    }
}
