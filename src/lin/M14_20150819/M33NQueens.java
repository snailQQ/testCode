package lin.M14_20150819;

import java.util.ArrayList;

/**
 * Created by Paul on 8/18/15.
 * http://www.lintcode.com/en/problem/n-queens/
 * http://www.cnblogs.com/springfor/p/3870944.html
 */
//N-Queens
//
//        20% Accepted
//        The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.
//
//        Given an integer n, return all distinct solutions to the n-queens puzzle.
//
//        Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space respectively.
//
//        Have you met this question in a real interview? Yes
//        Example
//        There exist two distinct solutions to the 4-queens puzzle:
//
//        [
//
//        [".Q..", // Solution 1
//
//        "...Q",
//
//        "Q...",
//
//        "..Q."],
//
//        ["..Q.", // Solution 2
//
//        "Q...",
//
//        "...Q",
//
//        ".Q.."]
//
//        ]
//
//        Challenge
//        Can you do it without recursion?
public class M33NQueens {
    /**
     * Get all distinct N-Queen solutions
     * @param n: The number of queens
     * @return: All distinct solutions
     * For example, A string '...Q' shows a queen on forth position
     */
    public static ArrayList<String[]> solveNQueens(int n) {
        ArrayList<String[]> res = new ArrayList<String[]>();
        if(n<=0)
            return res;

        int [] columnVal = new int[n];

        DFS_helper(n,res,0,columnVal);
        return res;
    }

    public static void DFS_helper(int nQueens, ArrayList<String[]> res, int row, int[] columnVal){
        if(row == nQueens){
            String[] unit = new String[nQueens];
            for(int i = 0; i < nQueens; i++){
                StringBuilder s = new StringBuilder();
                for(int j = 0; j < nQueens; j++){
                    if(j == columnVal[i])
                        s.append("Q");
                    else
                        s.append(".");
                }

                unit[i] = s.toString();
            }

            res.add(unit);
        }else{
            for(int i = 0; i < nQueens; i++){
                columnVal[row] = i;//(row,columnVal[row)==>(row,i)

                if(isValid(row,columnVal))
                    DFS_helper(nQueens, res, row+1, columnVal);
            }
        }
    }

    public static boolean isValid(int row, int [] columnVal){
        for(int i = 0; i < row; i++){
            if(columnVal[row] == columnVal[i]
                    ||Math.abs(columnVal[row]-columnVal[i]) == row-i)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<String[]> a = solveNQueens(4);
    }
}
