package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Paul on 9/30/15.
 */
public class LeetEPalindromePermutation266 {
    public static boolean canPermutePalindrome(String s) {
        if(s == null || s.length() == 0) {
            return false;
        }

        LinkedList<Character> list = new LinkedList<Character>();
        for(int i = 0; i < s.length(); i++) {
            if(list.contains(s.charAt(i))) {
                list.remove(s.charAt(i));
            } else {
                list.add(s.charAt(i));
            }
        }

        if(s.length() % 2 == 0 && list.size() == 0) {
            return true;
        }
        if(s.length() % 2 == 1&& list.size() == 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean a = canPermutePalindrome("aa");
    }
}
