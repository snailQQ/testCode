package leetcode.leetcode;

/**
 * Created by Paul on 10/29/15.
 * question link
 * <p/>https://leetcode.com/problems/longest-common-prefix/submissions/
 * answer link
 */
public class _14LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }
        if(strs.length == 1) {
            return strs[0];
        }
        String cf = "";
        for(int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++) {
                if(strs[j].length() < i+1 || c != strs[j].charAt(i)) {
                    return cf;
                }
            }
            cf += c;
        }
        return cf;
    }
}
