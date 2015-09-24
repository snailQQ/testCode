package lin.M18_20150823;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Paul on 8/23/15.
 * http://www.lintcode.com/en/problem/word-break/
 * http://www.cnblogs.com/feiling/p/3357022.html
 * http://www.jiuzhang.com/solutions/word-break/最优解
 */
//Word Break
//
//        11% Accepted
//        Given a string s and a dictionary of words dict, determine if s can be break into a space-separated sequence of one or more dictionary words.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given s = "lintcode", dict = ["lint", "code"].
//
//        Return true because "lintcode" can be break as "lint code".


//    次优解不能在lintcode通过http://blog.csdn.net/ljphhj/article/details/21643391
//    假设现在指针看到第i个字母
//那么从0到i这些字母组成的字符串能不能用字典的单词分隔只要看
//0到j中是不是有在字典中，j到i是不是也同时在字典中。如果都在说明可以组成，
//而0到j可以在布尔型数组里预存结果。所以就只要看j到i在不在就行。


public class M107WordBreak {

    /**
     * @param s: A string s
     * @param dict: A dictionary of words dict
     */
    public static boolean wordBreak(String s, Set<String> dict) {
        // write your code here
        if(s == null || s.length() == 0 || dict.isEmpty()) {
            return false;
        }

        boolean[] flgArray = new boolean[s.length()+1];
        flgArray[0] = true;

        for(int i = 1; i < s.length(); i++) {
            for(int j = 0; j < i; j++) {
                if(flgArray[j] && dict.contains(s.substring(j,i))){
                    flgArray[i] = true;
                    break;
                }
            }
        }
        return flgArray[s.length()];
    }

    public static void main(String[] args) {
        String s = "a";
        Set<String> dict = new HashSet<String>();
        dict.add("b");
        boolean x = wordBreak(s, dict);

    }
}
