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
}
