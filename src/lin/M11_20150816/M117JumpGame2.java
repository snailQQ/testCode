package lin.M11_20150816;

/**
 * Created by Paul on 8/16/15.
 * http://www.lintcode.com/en/problem/jump-game-ii/
 */
//Jump Game II
//
//        33% Accepted
//        Given an array of non-negative integers, you are initially positioned at the first index of the array.
//
//        Each element in the array represents your maximum jump length at that position.
//
//        Your goal is to reach the last index in the minimum number of jumps.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given array A = [2,3,1,1,4]
//
//        The minimum number of jumps to reach the last index is 2.
// (Jump 1 step from index 0 to 1, then 3 steps to the last index.)
public class M117JumpGame2 {
    /**
     * @param A: A list of lists of integers
     * @return: An integer
     */
    public static int jump(int[] A) {
        // write your code here
        if(A == null || A.length == 0) {
            return 0;
        }
        int maxCover = 0;
        int count = 0;
        for(int i = 0; i <= maxCover && i < A.length; i++) {
            if(A[i]+i > maxCover) {
                maxCover = A[i]+i;
                count++;
            }
            if(maxCover >= A.length-1)
                return count;
        }
        return 0;
    }

    public static void main(String [] args) {
//        int[] A = {2,3,1,1,4};
        int[] A = {17,8,29,17,35,28,14,2,45,8,6,54,24,43,20,14,33,31,27,11};
        int b=jump(A);
    }
}
