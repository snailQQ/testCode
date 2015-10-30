package leetcode.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul on 10/29/15.
 * question link
 * <p/>
 * answer link
 */
public class _22GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        if(n <= 0) {
            return list;
        }
        helper(list, "", n, n);
        return list;
    }

    private static void helper(List<String> list, String str, int left, int right) {
        if(left > right || left < 0 || right < 0) {
            return;
        }
        if(left == 0 && right == 0) {
            list.add(str);
            return;
        }
        helper(list, str+"(", left-1, right);
        helper(list, str+")", left, right-1);
    }

    public static void main(String[] args) {
        List<String> a = generateParenthesis(3);
    }
}
