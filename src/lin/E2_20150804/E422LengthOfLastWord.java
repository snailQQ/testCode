package lin.E2_20150804;

/**
 * Created by Paul on 8/3/15.
 * http://www.lintcode.com/en/problem/length-of-last-word/
 * http://www.cnblogs.com/springfor/p/3872326.html
 */
//Length of Last Word
//
//        37% Accepted
//        Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
// return the length of last word in the string.
//
//        If the last word does not exist, return 0.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given s = "Hello World", return 5.
public class E422LengthOfLastWord {
    /**
     * @param s A string
     * @return the length of last word
     */
    public static int lengthOfLastWord(String s) {
        // Write your code here
        if(s.isEmpty() || s.length() == 0) {
            return 0;
        }
        int count = 0;

        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) != ' ') {
                count++;

            }else if(s.charAt(i) == ' ' && count != 0){
                return count;
            }
        }

        return count;
//
    }

    public static void main(String [] args) {
        int a = lengthOfLastWord("Today is a nice day");
    }
}
