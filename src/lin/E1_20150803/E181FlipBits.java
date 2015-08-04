package lin.E1_20150803;

/**
 * Created by Paul on 8/2/15.
 * http://www.lintcode.com/en/problem/flip-bits/
 */

//Flip Bits

//        29% Accepted
//        Determine the number of bits required to flip if you want to convert integer n to integer m.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given n = 31 (11111), m = 14 (01110), return 2.
//
//        Note
//        Both n and m are 32-bit integers.
public class E181FlipBits {
    /**
     *@param a, b: Two integer
     *return: An integer
     */
    public static int bitSwapRequired(int a, int b) {
        // write your code here
        int count = 0;
        for(int i =0; i<32; i++){
            if( (a&b) == 0) {
                count++;

            }
            a = a >>> 1;
            b = b >>> 1;

        }
        return count;
    }

    public static void main(String [] args) {
        int a = 14;
        int b = 31;
        int count = bitSwapRequired(a, b);
    }
}
