package lin.M18_20150823;

/**
 * Created by Paul on 8/23/15.
 * http://www.lintcode.com/en/problem/word-search/
 * http://www.jiuzhang.com/solutions/word-search/
 * http://www.cnblogs.com/springfor/p/3883942.html
 */
//Word Search
//
//        25% Accepted
//        Given a 2D board and a word, find if the word exists in the grid.
//
//        The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given board =
//
//        [
//        "ABCE",
//        "SFCS",
//        "ADEE"
//        ]
//        word = "ABCCED", -> returns true,
//        word = "SEE", -> returns true,
//        word = "ABCB", -> returns false.
public class M123WordSearch {
    /**
     * @param board: A list of lists of character
     * @param word: A string
     * @return: A boolean
     */
    public boolean exist(char[][] board, String word) {
        // write your code here
        if(board == null || board.length == 0 || board[0].length == 0) {
            return false;
        }
        if(word.length() == 0) {
            return true;
        }
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j <board[0].length; j++) {
                if(board[i][j] == word.charAt(0)) {
                    return dfs(board, word, i, j, 0);
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int i, int j, int pos) {
        if(pos == word.length()) {
            return true;
        }

        if(i < 0 || i > board.length || j < 0 || j > board[0].length || board[i][j] != word.charAt(pos)) {
            return false;
        }
        board[i][j] = '#';
        boolean rst = dfs(board, word, i-1, j, pos+1) || dfs(board, word, i+1, j, pos+1) || dfs(board, word, i, j-1, pos+1) || dfs(board, word, i, j+1, pos+1);
        board[i][j] = word.charAt(pos);
        return rst;

    }

    public static void main(String[] args) {

    }
}
