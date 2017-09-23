package leetcode.leetcode.to320;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>
 * answer link
 * http://blog.csdn.net/u013027996/article/details/48713751
 */
public class _282ExpressionAddOperators {
    public static List<String> addOperators(String num, int target) {
        List<String> list = new ArrayList<String>();
        dfs(list, num, "", 0, 0, 0, target);
        return list;
    }

    private static void dfs(List<String> list, String num, String path,
                     int pos, long sum, long lastNum, int target) {
        int len = num.length();
        if (pos == len && sum == target) {
            list.add(path);
            return;
        }
        if (pos >= len) {
            return;
        }
        for (int i = pos; i < len; i++) {
//            if (i != pos && num.charAt(pos) == '0') {
//                break;
//            }
            long curNum = Long.parseLong(num.substring(pos, i + 1));
            if (pos == 0) {
                dfs(list, num, path + "" + curNum, i + 1, curNum, curNum, target);
            } else {
                dfs(list, num, path + "+" + curNum, i + 1,
                        sum + curNum, curNum, target);
                dfs(list, num, path + "-" + curNum, i + 1,
                        sum - curNum, -curNum, target);
                dfs(list, num, path + "*" + curNum, i + 1,
                        sum - lastNum + lastNum * curNum, lastNum * curNum, target);
            }
        }
    }

    public static void main(String[] args) {
        List<String> a = addOperators("105", 5);
    }
}
