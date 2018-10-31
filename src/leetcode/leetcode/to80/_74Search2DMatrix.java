package leetcode.leetcode.to80;

/**
 * Created by Paul on 11/2/15.
 * question link https://leetcode.com/problems/search-a-2d-matrix/description/
 *
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

 Integers in each row are sorted from left to right.
 The first integer of each row is greater than the last integer of the previous row.
 For example,

 Consider the following matrix:

 [
 [1,   3,  5,  7],
 [10, 11, 16, 20],
 [23, 30, 34, 50]
 ]
 Given target = 3, return true.
 * <p/>
 * answer link
 */
public class _74Search2DMatrix {
  public static boolean searchMatrix(int[][] matrix, int target) {
    if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
      return false;
    }

    int row = matrix.length;
    int col = matrix[0].length;

    int start = 0;
    int end = row * col - 1;

    while (start + 1 < end) {
      int mid = start + (end - start) / 2;
      if(matrix[mid / col][mid % col] == target) {
        return true;
      } else if(matrix[mid / col][mid % col] > target) {
        end = mid;
      } else {
        start = mid;
      }
    }

    int a = start / col;
    int b = start % col;
    int c = end / col;
    int d = end % col;
    if((matrix[start / col][start % col] == target) || (matrix[end / col][end % col] == target)) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
    int[][] arr1 = {{1,3,5}};

//    System.out.println(searchMatrix(arr, 3));
    System.out.println(searchMatrix(arr1, 0));
  }
}
