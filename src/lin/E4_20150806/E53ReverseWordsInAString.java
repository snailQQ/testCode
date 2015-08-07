package lin.E4_20150806;

/**
 * Created by Paul on 8/5/15.
 * http://www.lintcode.com/en/problem/reverse-words-in-a-string/
 */
//Reverse Words in a String
//
//        23% Accepted
//        Given an input string, reverse the string word by word.
//
//        For example,
//        Given s = "the sky is blue",
//        return "blue is sky the".
//
//        Have you met this question in a real interview? Yes
//        Example
//        Clarification
//        What constitutes a word?
//        A sequence of non-space characters constitutes a word.
//        Could the input string contain leading or trailing spaces?
//        Yes. However, your reversed string should not contain leading or trailing spaces.
//        How about multiple spaces between two words?
//        Reduce them to a single space in the reversed string.

public class E53ReverseWordsInAString {
    /**
     * @param s : A string
     * @return : A string
     */
    public static String reverseWords(String s) {
        // write your code
        String[] a = s.split(" ");
        String returnValue = "";
        for(int i = a.length-1; i >=0; i--) {
            if(i != a.length-1) {
                returnValue += " ";
            }
            returnValue += a[i];
        }
        return returnValue;
    }

    public static void main(String [] args) {
        String a = "the sky is blue";
        String b = reverseWords(a);

    }

}
