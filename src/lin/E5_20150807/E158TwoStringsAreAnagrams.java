package lin.E5_20150807;

import java.util.Arrays;

/**
 * Created by Paul on 8/6/15.
 * http://www.lintcode.com/en/problem/two-strings-are-anagrams/
 * http://javarevisited.blogspot.com/2013/03/Anagram-how-to-check-if-two-string-are-anagrams-example-tutorial.html
 * http://www.jiuzhang.com/solutions/two-strings-are-anagrams/
 */
//Two Strings Are Anagrams
//
//        28% Accepted
//        Write a method anagram(s,t) to decide if two strings are anagrams or not.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given s="abcd", t="dcab", return true.
//
//        Challenge
//        O(n) time, O(1) extra space
public class E158TwoStringsAreAnagrams {
    /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public static  boolean anagram(String s, String t) {
        // write your code here
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        String sss = new String(ss);
        String ttt = new String(tt);
        return sss.equals(ttt);
    }


}
