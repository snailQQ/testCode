package leetcode.leetcode.to280;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Paul on 11/17/15.
 * question link
 * Given a string, determine if a permutation of the string could form a palindrome.

 For example,
 "code" -> False, "aab" -> True, "carerac" -> True.

 Hint:

 Consider the palindromes of odd vs even length. What difference do you notice?Show More Hint
 Hide Company Tags Google Uber
 Hide Tags Hash Table
 Hide Similar Problems (M) Longest Palindromic Substring (E) Valid Anagram (M) Palindrome Permutation II

 * <p/>
 * answer link
 */
public class _266_PalindromePermutation {
    public static boolean canPermutePalindrome(String s) {
        Set<Character> set=new HashSet<Character>();
//        for(int i=0; i<s.length(); ++i){
//            if (!set.contains(s.charAt(i)))
//                set.add(s.charAt(i));
//            else
//                set.remove(s.charAt(i));
//        }
//        return set.size()==0 || set.size()==1;
        for(char c : s.toCharArray()) {
            if(!set.contains(c)) {
                set.add(c);
            } else {
                set.remove(c);
            }
        }
        return set.size() == 0 || set.size() == 1;
    }

    public static void main(String[] args) {
        boolean a = canPermutePalindrome("abcadcb");
    }
}
