package lin.M11_20150816;

import java.util.ArrayList;

/**
 * Created by Paul on 8/16/15.
 * http://www.lintcode.com/en/problem/longest-common-prefix/
 */
//Longest Common Prefix
//
//        28% Accepted
//        Given k strings, find the longest common prefix (LCP).
//
//        Have you met this question in a real interview? Yes
//        Example
//        For strings "ABCD", "ABEF" and "ACEF", the LCP is "A"
//
//        For strings "ABCDEFG", "ABCEFG" and "ABCEFA", the LCP is "ABC"
public class M78LongestCommonPrefix {
    /** @param strs: A list of strings
    * @return: The longest common prefix
    */
    public static String longestCommonPrefix(String[] strs) {
        // write your code here
        if(strs.length == 0 || strs == null) {
            return "";
        }
        if(strs.length == 1) {
            return strs[0];
        }
        String a = strs[0];
        String b = strs[1];

        if(a.equals("") || b.equals("")) {
            return "";
        }
        int length = 0;
        if(a.length() > b.length()) {
            length = b.length();
        }else {
            length = a.length();
        }

        String LCP = "";
        for(int i = 0; i < length; i++) {
            if(a.charAt(i) == b.charAt(i)){
                LCP += a.charAt(i);
            }else{
                break;
            }
        }

        for(int i = 2; i < strs.length; i++) {
            if(strs[i].equals("")){
                return "";
            }
            if(strs[i].length() >= LCP.length()){
                for(int j = 0; j < LCP.length(); j++) {
                    if(strs[i].charAt(j) == LCP.charAt(j)){
                        continue;
                    }else{
                        LCP = LCP.substring(0, j);
                    }
                }
            }else{
                for(int j = 0; j < strs[i].length(); j++) {
                    if(strs[i].charAt(j) == LCP.charAt(j)){
                        continue;
                    }else{
                        LCP = LCP.substring(0, j);
                    }
                }
            }

        }

        return LCP;
    }

    public static void main(String [] args) {
//        For strings "ABCDEFG", "ABCEFG" and "ABCEFA", the LCP is "ABC"
//        String[]  a = {"ABCDEFG","ABCEFG","ABCEFA"};
        String[]  a = {"ABCD","ABEF","ACEF"};
        String b = longestCommonPrefix(a);
    }
}
