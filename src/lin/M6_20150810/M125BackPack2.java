package lin.M6_20150810;

/**
 * Created by Paul on 8/9/15.
 */
//Backpack II
//
//        33% Accepted
//        Given n items with size Ai and value Vi, and a backpack with size m. What's the maximum value can you put into the backpack?
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given 4 items with size [2, 3, 5, 7] and value [1, 5, 2, 4], and a backpack with size 10. The maximum value is 9.
//
//        Note
//        You cannot divide item into small pieces and the total size of items you choose should smaller or equal to m.
//
//        Challenge
//        O(n x m) memory is acceptable, can you do it in O(m) memory?
public class M125BackPack2 {
    /**
     * @param m: An integer m denotes the size of a backpack
     * @param A & V: Given n items with size A[i] and value V[i]
     * @return: The maximum value
     */
    public static int backPackII(int m, int[] A, int V[]) {
        // write your code here
        if(A == null || V == null) {
            return 0;
        }

        int[][] dp = new int[A.length][m+1];

        for(int i = 0; i < A.length; i++) {
            dp[i][0] = 0;
        }

        for(int i = 1; i < m+1; i++) {
            if(i >= A[0]) {
                dp[0][i] = V[0];
            } else {
                dp[0][i] = 0;
            }
        }

        for(int i = 1; i < A.length; i++) {
            for(int j = 1; j < m+1; j++) {
                if( j >= A[i]) {
                    int value = V[i]+ dp[i-1][j-A[i]];
                    if( value > dp[i-1][j]) {
                        dp[i][j] = value;
                    } else {
                        dp[i][j] = dp[i-1][j];
                    }
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[A.length-1][m];
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 7};
        int[] b = {1, 5, 2, 4};
        int c = backPackII(10, a, b);
    }
}
