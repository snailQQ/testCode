package lin.E5_20150807;

import java.util.Stack;

/**
 * Created by Paul on 8/6/15.
 * http://www.lintcode.com/en/problem/valid-palindrome/
 * http://www.cnblogs.com/springfor/p/3884156.html
 */
//Valid Palindrome
//
//        23% Accepted
//        Given a string, determine if it is a palindrome,
// considering only alphanumeric characters and ignoring cases.
//
//        Have you met this question in a real interview? Yes
//        Example
//        "A man, a plan, a canal: Panama" is a palindrome.
//
//        "race a car" is not a palindrome.
//
//        Note
//        Have you consider that the string might be empty?
// This is a good question to ask during an interview.
//
//        For the purpose of this problem, we define empty string as valid palindrome.
//
//        Challenge
//        O(n) time without extra memory.
public class E415ValidPalindrome {
    /**
     * @param s A string
     * @return Whether the string is a valid palindrome
     */
    public static boolean isPalindrome(String s) {
        // Write your code here
        if(s == null) {
            return false;
        }
        if(s.length() <= 1) {
            return true;
        }
        s = s.toUpperCase();

        int left = 0;
        int right = s.length() - 1;

        while(left <= right) {
            if(isValid(s.charAt(left)) && isValid(s.charAt(right))) {
                if(s.charAt(left) != s.charAt(right)) {
                    return false;
                }else {
                    left++;
                    right--;
                }
            } else if(!isValid(s.charAt(left))) {
                left++;
            } else if(!isValid(s.charAt(right))) {
                right--;
            }
        }
        return true;
    }

    private static boolean isValid(char c) {
        if((c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String [] args) {
        boolean a = isPalindrome("ab");
    }
}
