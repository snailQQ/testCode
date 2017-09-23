package leetcode.leetcode.to80;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>https://leetcode.com/problems/word-search/
 * answer link
 * http://www.cnblogs.com/springfor/p/3883942.html
 */
public class _79WordSearch {
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0 || board[0].length == 0) {
            return false;
        }
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == word.charAt(0)) {
                    boolean isExist = helper(board, word, i, j, 0);
                    if(isExist) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean helper(char[][] board, String word, int i, int j, int pos) {
        if(word.length() == pos) {
            return true;
        }
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(pos)) {
            return false;
        }
        board[i][j] = '#';
        boolean hasChar = helper(board, word, i+1, j, pos+1) || helper(board, word, i, j+1, pos+1) || helper(board, word, i-1, j, pos+1) || helper(board, word, i, j-1, pos+1);
        board[i][j] = word.charAt(pos);
        return hasChar;
    }
}
