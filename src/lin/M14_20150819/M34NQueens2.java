package lin.M14_20150819;

/**
 * Created by Paul on 8/18/15.
 */
//N-Queens II
//
//        38% Accepted
//        Follow up for N-Queens problem.
//
//        Now, instead outputting board configurations, return the total number of distinct solutions.
//
//        Have you met this question in a real interview? Yes
//        Example
//        For n=4, there are 2 distinct solutions.
//
//        Tags Expand
public class M34NQueens2 {
    public int totalNQueens(int n) {
        int[] res = {0};
        if(n<=0)
            return res[0];

        int [] columnVal = new int[n];

        DFS_helper(n,res,0,columnVal);
        return res[0];
    }

    public void DFS_helper(int nQueens, int[] res, int row, int[] columnVal){
        if(row == nQueens){
            res[0] += 1;
        }else{
            for(int i = 0; i < nQueens; i++){
                columnVal[row] = i;//(row,columnVal[row)==>(row,i)

                if(isValid(row,columnVal))
                    DFS_helper(nQueens, res, row+1, columnVal);
            }
        }
    }

    public boolean isValid(int row, int [] columnVal) {
        for (int i = 0; i < row; i++) {
            if (columnVal[row] == columnVal[i]
                    || Math.abs(columnVal[row] - columnVal[i]) == row - i)
                return false;
        }
        return true;
    }
}
