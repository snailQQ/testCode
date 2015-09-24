package lin.M6_20150810;

/**
 * Created by Paul on 8/9/15.
 * http://www.lintcode.com/en/problem/backpack/
 */
//Backpack
//
//        18% Accepted
//        Given n items with size Ai, an integer m denotes the size of a backpack. How full you can fill this backpack?
//
//        Have you met this question in a real interview? Yes
//        Example
//        If we have 4 items with size [2, 3, 5, 7], the backpack size is 11, we can select [2, 3, 5],
// so that the max size we can fill this backpack is 10.
// If the backpack size is 12. we can select [2, 3, 7] so that we can fulfill the backpack.
//
//        You function should return the max size we can fill in the given backpack.
//
//        Note
//        You can not divide any item into small pieces.
//
//        Challenge
//        O(n x m) time and O(m) memory.
//
//        O(n x m) memory is also acceptable if you do not know how to optimize memory.
public class M92BackPack {
    /**
     * @param m: An integer m denotes the size of a backpack
     * @param A: Given n items with size A[i]
     * @return: The maximum size
     */
    public static int backPack(int m, int[] A) {
        // write your code here
        boolean f[][] = new boolean[A.length + 1][m + 1];
        for (int i = 0; i <= A.length; i++) {
            for (int j = 0; j <= m; j++) {
                f[i][j] = false;
            }
        }
        f[0][0] = true;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j <= m; j++) {
                f[i + 1][j] = f[i][j];
                if (j >= A[i] && f[i][j - A[i]]) {
                    f[i + 1][j] = true;
                }
                print(f);
                System.out.println();
            } // for j
        } // for i

        for (int i = m; i >= 0; i--) {
            if (f[A.length][i]) {
                return i;
            }
        }
        return 0;
    }

    public static void print(boolean[][] f) {
        for(int i = 0; i < f.length; i++) {
            for(int j = 0; j < f[0].length; j++) {
                System.out.print(f[i][j] + " " );
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] array  = {2,3,5,7};
        int a = backPack(11, array );
    }
}


//solution2
//http://www.jiuzhang.com/problem/58/
//本题是最基础的背包问题，特点是：每种物品仅有一件，可以选择放或不放，那下面我们来看背包这题动态规划的四点是怎么样的呢？
//
//        1. State: dp[i][S] 表示前i个物品，取出一些能否组成和为S体积的背包
//
//        2. Function: f[i][S] = f[i-1][S - A[i]] or f[i-1][S] (A[i]表示第i个物品的大小)
//
//        转移方程想得到f[i][S]前i个物品取出一些物品想组成S体积的背包。 那么可以从两个状态转换得到。
//
//        （1）f[i-1][S - A[i]] 放入第i个物品，并且前i-1个物品能否取出一些组成和为S-A[i] 体积大小的背包。
//
//        （2）f[i-1][S] 不放入第i个物品， 并且前i-1个物品能否取出一些组成和为S 体积大小的背包。
//
//        3. Intialize: f[1...n][0] = true; f[0][1... m] = false
//
//        初始化 f[1...n][0] 表示前1...n个物品，取出一些能否组成和为0 大小的背包始终为真。
//
//        其他初始化为假
//
//        4. Answer: 寻找使f[n][S] 值为true的最大的S. （S的取值范围1到m）
//
//        由于这道题空间上有一些要求，所以在知道了思路答案过后我们还需要进行优化空间复杂度.先考虑上面讲的基本思路如何实现，肯定是有一个主循环i=1..N，每次算出来二维数组f[i][0..S]的所有值。那么，如果只用一个数组f[0..S]，能不能保证第i次循环结束后f[S]中表示的就是我们定义的状态f[i][S]呢？f[i][S]是由 f[i-1][S - a[i]] 和 f[i-1][S] 两个子问题递推而来，能否保证在推f[i][S]时（也即在第i次主循环中推f[S]时）能够得到 f[i-1][S - a[i]] 和 f[i-1][S] 的值呢？事实上，这要求在每次主循环中我们以S=m...0的顺序推f[S]，这样才能保证推f[S]时f[S-a[i]]保存的是状态f[i-1][S-a[i]]的值。伪代码如下：
//
//        for i=1..N
//
//        for S=m...0
//
//        f[S]=f[S] or f[S-a[i]];
//
//        if(A == null || A.length == 0) {
//        return 0;
//        }
//
//        boolean[][] dp = new boolean[A.length+1][m+1];
//        for(int i = 0; i < dp.length; i++) {
//        dp[i][0] = true;
//        }
//
//        for(int i = 1; i < dp.length; i++) {
//        for(int j = 1; j < dp[0].length; j++) {
//        if(j == A[i-1] || dp[i-1][j] == true) {
//        dp[i][j] = true;
//        }
//        if(j > A[i-1] && dp[i-1][j-A[i-1]]) {
//        dp[i][j] = true;
//        }
//        }
//        }
//
//        for(int i = dp[A.length].length-1; i >= 0; i--) {
//        if(dp[A.length][i] == true) {
//        return i;
//        }
//        }
//        return 0;