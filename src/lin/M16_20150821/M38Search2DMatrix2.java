package lin.M16_20150821;

/**
 * Created by Paul on 8/19/15.
 * http://www.lintcode.com/en/problem/search-a-2d-matrix-ii/
 */
//Search a 2D Matrix II
//
//        30% Accepted
//        Write an efficient algorithm that searches for a value in an m x n matrix, return the occurrence of it.
//
//        This matrix has the following properties:
//
//        * Integers in each row are sorted from left to right.
//
//        * Integers in each column are sorted from up to bottom.
//
//        * No duplicate integers in each row or column.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Consider the following matrix:
//
//        [
//
//        [1, 3, 5, 7],
//
//        [2, 4, 7, 8],
//
//        [3, 5, 9, 10]
//
//        ]
//
//        Given target = 3, return 2.
//
//        Challenge
//        O(m+n) time and O(1) extra space
public class M38Search2DMatrix2 {
    /**
     * @param matrix: A list of lists of integers
     * @param: A number you want to search in the matrix
     * @return: An integer indicate the occurrence of target in the given matrix
     */
//    public int searchMatrix(int[][] matrix, int target) {
        // write your code here
//        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
//           return Integer.MIN_VALUE;
//        }
//
//        int row = matrix.length;
//        int column = matrix[0].length;
//
//        int start = 0;
//        int end = row * column - 1;
//        while(start + 1 < end) {
//            int mid = start + (end - start) / 2;
//            if(matrix[mid/column][mid%column] == target) {
//                return true;
//            }
//        }

//    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int rowStart = 0;
        int rowEnd = m - 1;
        int colStart = 0;
        int colEnd = n - 1;

        if(m == 1) {
            while(colStart + 1 < colEnd) {
                int colMid = colStart + (colEnd - colStart) / 2;
                if(matrix[0][colMid] == target) {
                    return true;
                } else if(matrix[0][colMid] > target) {
                    colEnd = colMid;
                } else {
                    colStart = colMid;
                }
            }
            return (matrix[0][colEnd] == target || matrix[0][colStart] == target);
        }

        if(n == 1) {
            while(rowStart + 1 < rowEnd) {
                int rowMid = rowStart + (rowEnd - rowStart) / 2;
                if(matrix[rowMid][0] == target) {
                    return true;
                } else if(matrix[rowMid][0] > target) {
                    rowEnd = rowMid;
                } else {
                    rowStart = rowMid;
                }
            }

            return (matrix[rowStart][0] == target || matrix[rowEnd][0] == target);

        }

        while(rowStart + 1 < rowEnd && colStart + 1 < colEnd) {
            int rowMid = rowStart + (rowEnd - rowStart) / 2;
            int colMid = colStart + (colEnd - colStart) / 2;

            if(matrix[0][colMid] == target) {
                return true;
            } else if(matrix[0][colMid] > target) {
                colEnd = colMid;
            } else {
                colStart = colMid;
            }

            if(matrix[rowMid][0] == target) {
                return true;
            } else if(matrix[rowMid][0] > target) {
                rowEnd = rowMid;
            } else {
                rowStart = rowMid;
            }
        }

        return (matrix[rowStart][colEnd] == target || matrix[rowStart][colStart] == target || matrix[rowEnd][colEnd] == target || matrix[rowEnd][colStart] == target);
    }

    public static void main(String[] args) {
        boolean a = searchMatrix(new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}}, 5);
    }
}
