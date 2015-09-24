package lin.M11_20150816;

/**
 * Created by Paul on 8/16/15.
 * http://www.lintcode.com/en/problem/jump-game/
 * http://fisherlei.blogspot.com/2012/12/leetcode-jump-game.html
 * http://www.cnblogs.com/springfor/p/3872320.html
 * http://www.jiuzhang.com/solutions/jump-game/
 */
//Jump Game
//
//        39% Accepted
//        Given an array of non-negative integers, you are initially positioned at the first index of the array.
//
//        Each element in the array represents your maximum jump length at that position.
//
//        Determine if you are able to reach the last index.
//
//        Have you met this question in a real interview? Yes
//        Example
//        A = [2,3,1,1,4], return true.
//
//        A = [3,2,1,0,4], return false.
//
//        Note
//        This problem have two method which is Greedy and Dynamic Programming.
//
//        The time complexity of Greedy method is O(n).
//
//        The time complexity of Dynamic Programming method is O(n^2).
//
//        We manually set the small data set to allow you pass the test in both ways. This is just to let you learn how to use this problem in dynamic programming ways. If you finish it in dynamic programming ways, you can try greedy method to make it accept again.
public class M116JumpGame {
    /**
     * @param A: A list of integers
     * @return: The boolean answer
     */
    public boolean canJump(int[] A) {
        // wirte your code here
        if(A == null || A.length == 0) {
            return false;
        }
        int maxCover = 0;
        for(int i = 0; i <= maxCover && i < A.length; i++) {
            if(A[i]+i > maxCover)
                maxCover = A[i]+i;
            if(maxCover >= A.length-1)
                return true;
        }
        return false;
    }
}


//// version 1: Dynamic Programming
//public class Solution {
//    public boolean canJump(int[] A) {
//        boolean[] can = new boolean[A.length];
//        can[0] = true;
//
//        for (int i = 1; i < A.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if (can[j] && j + A[j] >= i) {
//                    can[i] = true;
//                    break;
//                }
//            }
//        }
//
//        return can[A.length - 1];
//    }
//}
//
//
//// version 2: Greedy
//public class Solution {
//    public boolean canJump(int[] A) {
//        // think it as merging n intervals
//        if (A == null || A.length == 0) {
//            return false;
//        }
//        int farthest = A[0];
//        for (int i = 1; i < A.length; i++) {
//            if (i <= farthest && A[i] + i >= farthest) {
//                farthest = A[i] + i;
//            }
//        }
//        return farthest >= A.length - 1;
//    }
//}


//if(A == null || A.length == 0) {
//        return false;
//        }
//
//        boolean[] dp = new boolean[A.length];
//
//        if(A[0]>0) {
//        dp[0] = true;
//        }
//
//        for(int i = 1; i < A.length; i++) {
//        for(int j =0; j < i; j++) {
//        if(dp[j] == true && j + A[j] >= i) {
//        dp[i] = true;
//        break;
//        }
//        }
//        }
//
//        return dp[A.length - 1];