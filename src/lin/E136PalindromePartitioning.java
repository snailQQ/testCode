package lin;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul on 7/29/15.
 */
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
public class E136PalindromePartitioning {
    /**
     * @param s: A string
     * @return: A list of lists of string
     */
//    public List<List<String>> partition(String s) {
//        // write your code here
//    }

    public static ArrayList<ArrayList<String>> partition(String s) {
        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        if (s == null) {
            return result;
        }
        ArrayList<String> path = new ArrayList<String>();
        helper(s, path, 0, result);
        return result;
    }

    private static boolean isPalindrome(String s) {
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

    private static void helper(String s, ArrayList<String> path, int pos,
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

    public static void main(String [] args) {
        String a = "aabbaaabvvb";
        partition(a);
    }
}
