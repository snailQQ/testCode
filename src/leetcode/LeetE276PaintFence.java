package leetcode;

/**
 * Created by Paul on 9/29/15.
 */
public class LeetE276PaintFence {
    public static int numWays(int n, int k) {
        if(k == 0 || n == 0) {
            return 0;
        }
        double prePre = k;
        double pre = k * k;
        if(n == 1) {
            return (int)prePre;
        }
        if(n == 2) {
            return (int)pre;
        }
        double count = pre;
        for(int i = 3; i <= n; i++) {
            count = Math.pow(k, i) - Math.pow(k, i-2);
        }
        return (int)count;
    }

    public static void main(String[] args) {
        int a = numWays(4,2);
    }
}
