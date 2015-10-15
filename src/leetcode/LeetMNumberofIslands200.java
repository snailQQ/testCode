package leetcode;

public class LeetMNumberofIslands200 {
	public static int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        
        int row = grid.length;
        int col = grid[0].length;
        
        int[][] dp = new int[row][col];
        int count = 0;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(grid[i][j] == '0') {
                    dp[i][j] = 0;
                    continue;
                }
                if(i == 0 && j == 0) {
                    if(grid[i][j] == '1') {
                        dp[i][j] = ++count;
                    }
                } else if(j == 0) {
                    if(dp[i-1][j] != 0) {
                        dp[i][j] = dp[i-1][j];
                    } else {
                        dp[i][j] = ++count;
                    }
                } else if(i == 0) {
                    if(dp[i][j-1] != 0) {
                        dp[i][j] = dp[i][j-1];
                    } else {
                        dp[i][j] = ++count;
                    }
                } else if(i != 0 && j != 0) {
                    if(dp[i][j-1] != 0 && dp[i-1][j] != 0) {
                        if(dp[i][j-1] == dp[i-1][j]) {
                            dp[i][j] = dp[i][j-1];
                        } else {
                            dp[i][j] = dp[i][j-1];
                            count--;
                        }
                    } else if(dp[i][j-1] != 0) {
                        dp[i][j] = dp[i][j-1];
                    } else if(dp[i-1][j] != 0) {
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
        }
        return count;
    }
	
	public static void main(String[] args) {
		int a = numIslands(new char[][]{{'1','0','0'},{'0','0','0'},{'0','0','1'}});
	}
}
