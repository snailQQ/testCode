package leetcode;

/**
 * Created by Paul on 9/29/15.
 * http://blog.csdn.net/lisonglisonglisong/article/details/45309651
 */
public class LeetE204CountPrimes {
    public static int countPrimes(int n) {
        if(n <= 2) {
            return 0;
        }
        boolean[] isPrime = new boolean[n];
        isPrime[2] = true;
        for(int i = 3; i < isPrime.length; i++) {
            if(i % 2 != 0) {
                isPrime[i] = true;
            }
        }

        for(int i = 3; i * i < n; i++) {
            if(isPrime[i] == true) {
                for(int j = i + i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for(int i = 0; i < n; i++) {
            if(isPrime[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a = countPrimes(4);
    }
}
