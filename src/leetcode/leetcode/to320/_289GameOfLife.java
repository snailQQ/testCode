package leetcode.leetcode.to320;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>https://leetcode.com/problems/game-of-life/
 * answer link
 */
public class _289GameOfLife {
    public void gameOfLife(int[][] board) {
        if(board == null || board.length == 0 || board[0].length == 0) {
            return;
        }

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                int liveNumber = getLiveNumber(board, i, j);
                if(board[i][j] == 0) {
                    if(liveNumber == 3) {
                        board[i][j] += 10;
                    }
                } else {
                    if(liveNumber == 2 || liveNumber == 3) {
                        board[i][j] += 10;
                    }
                }
            }
        }

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                board[i][j] /= 10;
            }
        }
    }

    private int getLiveNumber(int[][] board, int row, int col) {
        int count = 0;
        for(int i = row - 1; i <= row + 1; i++) {
            for(int j = col - 1; j <= col + 1; j++) {
                if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || (i == row && j == col)) {
                    continue;
                }
                count += board[i][j] % 10;
            }
        }
        return count;
    }
}
