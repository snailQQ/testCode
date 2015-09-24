package lin.M8_20150812;

/**
 * Created by Paul on 8/11/15.
 * http://www.cnblogs.com/EdwardLiu/p/4274497.html
 */
//Digit Counts
//
//        36% Accepted
//        Count the number of k's between 0 and n. k can be 0 - 9.
//
//        Have you met this question in a real interview? Yes
//        Example
//        if n=12, k=1 in [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12], we have FIVE 1's (1, 10, 11, 12)
//
//        Tags Expand
public class M2DigitCounts {
    /*
 * param k : As description.
 * param n : As description.
 * return: An integer denote the count of digit k in 1..n
 */
    public static int digitCounts(int k, int n) {
        // write your code here
//        if(n == 0){
//            n = 10;
//        }
//        int factor = 1;
//        for(int i = 1; i < k; i=i*10){
//            if(k / i > 10) {
//                factor++;
//            }
//        }
//        int count = 0;
//        for(int j = 0; j<= k; j++) {
//            for(int i = 0; i <= factor; i=i*10) {
//                if(j%i)
//            }
//
//        }
//
//        return count;
        int count = 0;
        int base = 1;
        while (n / base >= 1) {
            int curBit = n % (base*10) / base;
            int higher = n / (base*10);
            int lower = n % base;
            if (curBit < k) {
                count += higher * base;
            }
            else if (curBit == k) {
                count += higher * base + lower + 1;
            } else {
                count += (higher + 1) * base;
            }
            base *= 10;
        }
        return count;
    }

    public static void main(String [] args) {
        int count = digitCounts(12,1);
    }
}
