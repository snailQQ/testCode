package lin.E5_20150807;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Paul on 8/6/15.
 * http://www.lintcode.com/en/problem/valid-sudoku/
 * http://www.cnblogs.com/feiling/p/3232663.html
 * http://huntfor.iteye.com/blog/2077685 最简单解法
 * http://www.jiuzhang.com/solutions/valid-sudoku/
 */
//Valid Sudoku
//
//        28% Accepted
//        Determine whether a Sudoku is valid.
//
//        The Sudoku board could be partially filled, where empty cells are filled with the character ..
//
//        Have you met this question in a real interview? Yes
//        Example
//        The following partially filed sudoku is valid.
//
//        Valid Sudoku
//
//        Note
//        A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
//
//        Clarification
//        What is Sudoku?
//
//        http://sudoku.com.au/TheRules.aspx
//        https://zh.wikipedia.org/wiki/%E6%95%B8%E7%8D%A8
//        https://en.wikipedia.org/wiki/Sudoku
//        http://baike.baidu.com/subview/961/10842669.htm
public class E389Sudoku {
    /**
     * @param board: the board
     @return: wether the Sudoku is valid
     */
    public static boolean isValidSudoku(char[][] board) {
        if(board == null ||board.length == 0) {
            return false;
        }

        //scan row and column
        for(int i = 0; i < 9; i++) {
            Set<Character> row = new HashSet<Character>();
            Set<Character> column = new HashSet<Character>();
            for(int j = 0; j < 9; j++) {
                if(board[i][j] != '.') {
                    if(row.contains(board[i][j])) {
                        return false;
                    } else {
                        row.add(board[i][j]);
                    }
                }

                if(board[j][i] != '.') {
                    if(column.contains(board[j][i])) {
                        return false;
                    } else {
                        column.add(board[j][i]);
                    }
                }
            }
        }

        for(int i = 0; i < 9; i+=3) {
            for(int j = 0; j <9; j+=3) {
                Set<Character> square = new HashSet<Character>();
                for(int m = 0; m < 3; m++) {
                    for(int n = 0; n < 3; n++) {
                        if(board[i+m][j+n] != '.') {
                            if(square.contains(board[i+m][j+n])) {
                                return false;
                            } else {
                                square.add(board[i+m][j+n]);
                            }
                        }
                    }
                }
                square.clear();
            }
        }

        return true;
    }

    public static void main(String [] args) {
        char[][] board = {{'.','8','7','6','5','4','3','2','1'},{'2','.','.','.','.','.','.','.','.'},{'3','.','.','.','.','.','.','.','.'},{'4','.','.','.','.','.','.','.','.'},{'5','.','.','.','.','.','.','.','.'},{'6','.','.','.','.','.','.','.','.'},{'7','.','.','.','.','.','.','.','.'},{'8','.','.','.','.','.','.','.','.'},{'9','.','.','.','.','.','.','.','.'}};
        boolean a = isValidSudoku(board);
    }
}
