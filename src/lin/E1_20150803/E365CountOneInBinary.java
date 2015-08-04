package lin.E1_20150803;

/**
 * Created by Paul on 8/2/15.
 * http://www.lintcode.com/en/problem/count-1-in-binary/
 */
//Count 1 in Binary
//
//        51% Accepted
//        Count how many 1 in binary representation of a 32-bit integer.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given 32, return 1
//
//        Given 5, return 2
//
//        Given 1023, return 9
//

public class E365CountOneInBinary {
    /**
     * @param num: an integer
     * @return: an integer, the number of ones in num
     */
    public static int countOnes(int num) {
        // write your code here
        int count = 0;
        for(int i =0; i<32; i++){
            if( (num&1) == 1) {
                count++;

            }
            num = num >>> 1;

        }
        return count;
    }

    public  static void main(String [] args) {
        int x = 1023;
        int y = countOnes(x);
    }
}
