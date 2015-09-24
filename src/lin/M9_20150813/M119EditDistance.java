package lin.M9_20150813;

/**
 * Created by Paul on 8/12/15.
 * http://www.lintcode.com/en/problem/edit-distance/
 * http://blog.csdn.net/linhuanmars/article/details/24213795
 * http://www.cnblogs.com/springfor/p/3896167.html
 */
//Edit Distance
//
//        29% Accepted
//        Given two words word1 and word2, find the minimum number of steps required to convert word1 to word2.
// (each operation is counted as 1 step.)
//
//        You have the following 3 operations permitted on a word:
//
//        Insert a character
//        Delete a character
//        Replace a character
//        Have you met this question in a real interview? Yes
//        Example
//        Given word1 = "mart" and word2 = "karma", return 3.


//处理这道题也是用动态规划。
//
//        动态数组dp[word1.length+1][word2.length+1]
//
//        dp[i][j]表示从word1前i个字符转换到word2前j个字符最少的步骤数。
//
//        假设word1现在遍历到字符x，word2遍历到字符y（word1当前遍历到的长度为i，word2为j）。
//
//        以下两种可能性：
//
//        1. x==y，那么不用做任何编辑操作，所以dp[i][j] = dp[i-1][j-1]
//
//        2. x != y
//
//        (1) 在word1插入y， 那么dp[i][j] = dp[i][j-1] + 1
//
//        (2) 在word1删除x， 那么dp[i][j] = dp[i-1][j] + 1
//
//        (3) 把word1中的x用y来替换，那么dp[i][j] = dp[i-1][j-1] + 1
//
//        最少的步骤就是取这三个中的最小值。
//
//        最后返回 dp[word1.length+1][word2.length+1] 即可。
public class M119EditDistance {
    /**
     * @param word1 & word2: Two string.
     * @return: The minimum number of steps.
     */
    public int minDistance(String word1, String word2) {
        // write your code here
        if(word1 == null || word2 == null) {
            return 0;
        }

        int len1 = word1.length();
        int len2 = word2.length();

        int[][] dp = new int[len1+1][len2+1];

        for(int i = 0; i < len1+1; i++) {
            dp[i][0] = i;
        }

        for(int i = 0; i < len2+1; i++) {
            dp[0][i] = i;
        }

        for(int i = 1; i < len1+1; i++) {
            for(int j = 1; j < len2+1; j++) {
                if(word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                }else {
                    dp[i][j] = Math.min(Math.min(dp[i-1][j-1], dp[i-1][j]), dp[i][j-1]) + 1;
                }
            }
        }

        return dp[len1][len2];
    }
}
