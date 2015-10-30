package leetcode.leetcode;

/**
 * Created by Paul on 10/27/15.
 */
//questions
//https://leetcode.com/problems/longest-palindromic-substring/
//        answer
//        http://www.cnblogs.com/springfor/p/3889209.html
public class _4LongestPalindrome {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0 || s.length() == 1) {
            return s;
        }

        String maxStr = "";
        for(int i = 0; i < s.length(); i++) {
            String paliStr = find(s, i, i);
            maxStr = maxStr.length() > paliStr.length() ? maxStr : paliStr;
            paliStr = find(s, i, i+1);
            maxStr = maxStr.length() > paliStr.length() ? maxStr : paliStr;
        }

        return maxStr;
    }

    private String find(String s, int start, int end) {
        while(start >= 0 && end <= s.length()-1 && s.charAt(end) == s.charAt(start)) {
            start--;
            end++;
        }
        return s.substring(start+1, end);
    }
}
