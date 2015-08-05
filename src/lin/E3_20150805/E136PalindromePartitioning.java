package lin.E3_20150805;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul on 8/5/15.
 * http://www.lintcode.com/en/problem/palindrome-partitioning/
// */
//Palindrome Partitioning
//
//        22% Accepted
//
//
//        Given a string s, partition s such that every substring of the partition is a palindrome.
//
//        Return all possible palindrome partitioning of s.
//
//        Have you met this question in a real interview? Yes
//        Example
//        given s = "aab",
//        Return
//
//        [
//        ["aa","b"],
//        ["a","a","b"]
//        ]
//        Tags Expand

public class E136PalindromePartitioning {
    /**
     * @param s: A string
     * @return: A list of lists of string
     */
    public ArrayList<ArrayList<String>> partition(String s) {
        // write your code here
        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        if (s == null) {
            return result;
        }

        ArrayList<String> path = new ArrayList<String>();
        helper(s, path, 0, result);

        return result;
    }

    private boolean isPalindrome(String s) {
        int beg = 0;
        int end = s.length() - 1;
        while (beg < end) {
            if (s.charAt(beg) != s.charAt(end)) {
                return false;
            }

            beg++;
            end--;
        }

        return true;
    }

    private void helper(String s, ArrayList<String> path, int pos,
                        ArrayList<ArrayList<String>> result) {
        if (pos == s.length()) {
            result.add(new ArrayList<String>(path));
            return;
        }

        for (int i = pos + 1; i <= s.length(); i++) {
            String prefix = s.substring(pos, i);
            if (!isPalindrome(prefix)) {
                continue;
            }

            path.add(prefix);
            helper(s, path, i, result);
            path.remove(path.size() - 1);
        }
    }
}
