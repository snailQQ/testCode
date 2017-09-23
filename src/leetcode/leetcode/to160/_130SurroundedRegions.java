package leetcode.leetcode.to160;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>
 * answer link
 */
public class _130SurroundedRegions {
    public void solve(char[][] board) {
        if(board == null || board.length == 0) {
            return;
        }
        if(board.length < 2 || board[0].length < 2) {
            return;
        }

        for(int i = 0; i < board[0].length; i++) {
            if(board[0][i] == 'O') {
                helper(board, 0, i);
            }
            if(board[board.length-1][i] == 'O') {
                helper(board, board.length-1, i);
            }
        }

        for(int i = 0; i < board.length; i++) {
            if(board[i][0] == 'O') {
                helper(board, i, 0);
            }
            if(board[i][board[0].length-1] == 'O') {
                helper(board, i, board[0].length-1);
            }
        }

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == '*') {
                    board[i][j] = 'O';
                } else if(board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }

    }

    private void helper(char[][] board, int i , int j) {
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length) {
            return;
        }
        if(board[i][j] == 'O') {
            board[i][j] = '*';
        }

        if(i > 1 && board[i-1][j] == 'O') {
            helper(board, i-1, j);
        }
        if(i < board.length-2 && board[i+1][j] == 'O') {
            helper(board, i+1, j);
        }
        if(j > 1 && board[i][j-1] == 'O') {
            helper(board, i, j-1);
        }
        if(j < board[0].length-2 && board[i][j+1] == 'O') {
            helper(board, i, j+1);
        }
    }
}
