package lin.E4_20150806;

/**
 * Created by Paul on 8/5/15.
 * http://www.lintcode.com/en/problem/search-a-2d-matrix/
 * http://www.cnblogs.com/springfor/p/3857959.html
 * http://www.jiuzhang.com/solutions/search-a-2d-matrix/
 */
//Search a 2D Matrix
//
//        28% Accepted
//        Write an efficient algorithm that searches for a value in an m x n matrix.
//
//        This matrix has the following properties:
//
//        Integers in each row are sorted from left to right.
//        The first integer of each row is greater than the last integer of the previous row.
//        Have you met this question in a real interview? Yes
//        Example
//        Consider the following matrix:
//
//        [
//        [1, 3, 5, 7],
//        [10, 11, 16, 20],
//        [23, 30, 34, 50]
//        ]
//        Given target = 3, return true.
//
//        Challenge
//        O(log(n) + log(m)) time
//
//        Tags Expand
//
//        Related Problems Expand
public class E28Search2DMatrix {
    /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    //解法一:http://www.jiuzhang.com/solutions/search-a-2d-matrix/时间复杂度 log(m*n)
//    public boolean searchMatrix(int[][] matrix, int target) {
//        // write your code here
//        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
//            return false;
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
//            } else  if(matrix[mid/column][mid%column] > target) {
//                end = mid;
//            }else {
//                start = mid;
//            }
//        }
//
//        if(matrix[start/column][start%column] == target) {
//            return true;
//        }else if(matrix[end/column][end%column] == target) {
//            return true;
//        }
//        return false;
//    }

    //解法二:http://www.jiuzhang.com/solutions/search-a-2d-matrix/ 时间复杂度 log(m) + log(n)
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int row = matrix.length;
        int column = matrix[0].length;

        int start = 0;
        int end = row - 1;
        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if(matrix[mid][0] == target) {
                return true;
            } else  if(matrix[mid][0] > target) {
                end = mid;
            }else {
                start = mid;
            }
        }

        if(matrix[start][0] <= target) {
            row = start;
        }else if(matrix[end][0] <= target) {
            row = end;
        }else {
            return false;
        }



        start = 0;
        end = column - 1;
        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if(matrix[row][mid] == target) {
                return true;
            } else  if(matrix[row][mid] > target) {
                end = mid;
            }else {
                start = mid;
            }
        }

        if(matrix[row][start] == target) {
            return true;
        }else if(matrix[row][end] == target) {
            return true;
        }
        return false;


    }
}
