package lin.E1_20150803;

/**
 * Created by Paul on 8/2/15.
 * http://www.lintcode.com/en/problem/compare-strings/
 */
//Compare Strings
//
//        26% Accepted
//        Compare two strings A and B, determine whether A contains all of the characters in B.
//
//        The characters in string A and B are all Upper Case letters.
//
//        Have you met this question in a real interview? Yes
//        Example
//        For A = "ABCD", B = "ACD", return true.
//
//        For A = "ABCD", B = "AABC", return false.


public class E55CompareStrings {
    /**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return :  if string A contains all of the characters in B return true else return false
     */
    public static boolean compareStrings(String A, String B) {
        // write your code here
        int aLen = A.length();
        int bLen = B.length();
        if (aLen == 0) {
            return bLen == 0;
        }

        int[] count = new int[26];

        for (int i = 0; i < aLen; i++) {
            char c = A.charAt(i);
            count[c - 'A'] += 1;
        }

        for (int i = 0; i < bLen; i++) {
            char c = B.charAt(i);
            count[c - 'A'] -= 1;
            if (count[c - 'A'] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String [] args) {
        compareStrings("ABCD", "AABC");
    }
}
