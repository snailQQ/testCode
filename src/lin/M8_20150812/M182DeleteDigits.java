package lin.M8_20150812;

/**
 * Created by Paul on 8/11/15.
 */
//Delete Digits
//
//        16% Accepted
//        Given string A representative a positive integer which has N digits,
// remove any k digits of the number, the remaining digits are arranged according
// to the original order to become a new positive integer.
//
//        Find the smallest integer after remove k digits.
//
//        N <= 240 and k <= N,
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given an integer A = "178542", k = 4
//
//        return a string "12"


public class M182DeleteDigits {
    /**
     *@param A: A positive integer which has N digits, A is a string.
     *@param k: Remove k digits.
     *@return: A string
     */
    public String DeleteDigits(String A, int k) {
        // write your code here
        if(A.length()<2) return A;
        int i=0;
        StringBuilder s=new StringBuilder(A);
        while(i<s.length()-1){
            if(i>=0&&s.charAt(i)>s.charAt(i+1)){
                s.deleteCharAt(i);
                k--;
                if(k==0) break;
                i--;
            }
            else i++;
        }
        i=s.length()-1;
        while(k>0&&i>-1){
            s.deleteCharAt(i);
            i--;
            k--;
        }
        while(s.charAt(0)=='0'&&s.length()>1){
            s.deleteCharAt(0);
        }
        return s.toString();
    }
}
