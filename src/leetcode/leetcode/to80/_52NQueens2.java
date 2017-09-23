package leetcode.leetcode.to80;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>
 * answer link
 */
public class _52NQueens2 {
    int res = 0;
    public int totalNQueens(int n) {
        if(n <= 0) {
            return res;
        }
        int[] queens = new int[n];
        helper(n, queens, 0);
        return res;
    }

    private void helper(int n, int[] queens, int row) {
        if(n == row) {
            res++;
        } else {
            for(int i = 0; i < n; i++) {
                queens[row] = i;
                if(isValid(row, queens)) {
                    helper(n, queens, row+1);
                }

            }
        }
    }

    private boolean isValid(int row, int[] queens) {
        for(int i = 0; i < row; i++) {
            if(queens[i] == queens[row] || Math.abs(queens[row] - queens[i]) == (row - i)) {
                return false;
            }
        }
        return true;
    }
}
