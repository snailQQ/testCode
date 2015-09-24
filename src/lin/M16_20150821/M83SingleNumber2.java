package lin.M16_20150821;

/**
 * Created by Paul on 8/19/15.
 * http://www.cnblogs.com/springfor/p/3870863.html
 */
//Single Number II
//
//        39% Accepted
//        Given 3*n + 1 numbers, every numbers occurs triple times except one, find it.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given [1,1,2,3,3,3,2,2,4,1] return 4
//
//        Challenge
//        One-pass, constant extra space.
public class M83SingleNumber2 {
    /**
     * @param A : An integer array
     * @return : An integer
     */
    public static int singleNumberII(int[] A) {
        // write your code here
        int [] count = new int[32];
        int result = 0;
        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < A.length; j++) {
                int x = A[j] >> i;
                System.out.println(x+ " "+Integer.toBinaryString(x));
                if ((x & 1)==1) {
                    count[i]++;
                }
            }
            result |= ((count[i] % 3) << i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {33,44,2,33,33,44,2,2,44,1};
        int b = singleNumberII(a);
    }
}
