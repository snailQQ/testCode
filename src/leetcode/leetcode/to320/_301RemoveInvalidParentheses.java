package leetcode.leetcode.to320;

import java.util.*;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>
 * answer link
 */
public class _301RemoveInvalidParentheses {
//    public static List<String> removeInvalidParentheses(String s) {
//        int count = 0, openN = 0, closeN = 0;
//
//        // calculate the total numbers of opening and closing parentheses
//        // that need to be removed in the final solution
//        for (char c : s.toCharArray()) {
//            if (c == '(') {
//                count++;
//            } else if (c == ')') {
//                if (count == 0) closeN++;
//                else count--;
//            }
//        }
//        openN = count;
//        count = 0;
//
//        if (openN == 0 && closeN == 0) return Arrays.asList(s);
//
//        List<String> result = new ArrayList<>();
//        StringBuilder sb = new StringBuilder();
//
//        dfs(s.toCharArray(), 0, count, openN, closeN, result, sb);
//
//        return result;
//    }
//
//    private static void dfs(char[] s, int p, int count, int openN, int closeN, List<String> result, StringBuilder sb) {
//        if (count < 0) return; // the parentheses is invalid
//
//        if (p == s.length) {
//            if (openN == 0 && closeN == 0) { // the minimum number of invalid parentheses have been removed
//                result.add(sb.toString());
//            }
//            return;
//        }
//
//        if (s[p] != '(' && s[p] != ')') {
//            sb.append(s[p]);
//            dfs(s, p + 1, count, openN, closeN, result, sb);
//            sb.deleteCharAt(sb.length() - 1);
//        } else if (s[p] == '(') {
//            int i = 1;
//            while (p + i < s.length && s[p + i] == '(') i++; // use while loop to avoid duplicate result in DFS, instead of using HashSet
//            sb.append(s, p, i);
//            dfs(s, p + i, count + i, openN, closeN, result, sb);
//            sb.delete(sb.length() - i, sb.length());
//
//            if (openN > 0) {
//                // remove the current opening parenthesis
//                dfs(s, p + 1, count, openN - 1, closeN, result, sb);
//            }
//        } else {
//            int i = 1;
//            while (p + i < s.length && s[p + i] == ')') i++; // use while loop to avoid duplicate result in DFS, instead of using HashSet
//            sb.append(s, p, i);
//            dfs(s, p + i, count - i, openN, closeN, result, sb);
//            sb.delete(sb.length() - i, sb.length());
//
//            if (closeN > 0) {
//                // remove the current closing parenthesis
//                dfs(s, p + 1, count, openN, closeN - 1, result, sb);
//            }
//        }
//    }

    public static  List<String> removeInvalidParentheses(String s) {
        Set<String> set = new HashSet<String>();
        // if(s == null || s.length() == 0) {
        //     return new ArrayList<String>(set);
        // }
        int rmL = 0;
        int rmR = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                rmL++;
            }
            if(s.charAt(i) == ')') {
                if(rmR != 0) {
                    rmL--;
                } else {
                    rmR++;
                }
            }
        }

        helper(s, set, 0, rmL, rmR, 0, "");
        return new ArrayList<String>(set);
    }

    private static  void helper(String s, Set<String> set, int pos, int rmL, int rmR, int open, String str) {
        if(pos == s.length() && rmL == 0 && rmR == 0 && open == 0) {
            set.add(str);
            return;
        }

        if(pos == s.length() || rmL < 0 || rmR < 0 || open < 0) {
            return;
        }
        char c = s.charAt(pos);
        if(c == '(') {
            helper(s, set, pos+1, rmL-1, rmR, open, str);// delete
            helper(s, set, pos+1, rmL, rmR, open+1, str+c); //apend
        } else if(c == ')') {
            helper(s, set, pos+1, rmL, rmR-1, open, str);// delete
            helper(s, set, pos+1, rmL, rmR, open-1, str+c); //apend
        } else {
            helper(s, set, pos+1, rmL, rmR, open, str+c);
        }
    }

    public static void main(String[] args) {
        List<String> a = removeInvalidParentheses("n");
    }
}
