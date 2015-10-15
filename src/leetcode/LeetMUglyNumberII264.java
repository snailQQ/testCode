package leetcode;

public class LeetMUglyNumberII264 {
	public static int nthUglyNumber(int n) {
        if(n == 0) {
            return Integer.MIN_VALUE;
        }
        if(n == 1) {
            return 1;
        }
        
        int[] dp = new int[n];
        
        dp[0] = 1;
        int f2 = 0;
        int f3 = 0;
        int f5 = 0;
        
        for(int i = 1; i < n; i++) {
            dp[i] = Math.min(2*dp[f2], Math.min(3*dp[f3], 5*dp[f5]));
            if(dp[i] == 2*dp[f2]) {
                f2++;
            }
            if(dp[i] == 3*dp[f3]) {
                f3++;
            }
            if(dp[i] == 5*dp[f5]){
                f5++;
            }
        }
        
        return dp[n-1];
        
    }
	
	public static void main(String[] args) {
		int a = nthUglyNumber(6);
	}
}
