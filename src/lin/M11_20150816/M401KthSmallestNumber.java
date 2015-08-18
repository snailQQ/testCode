//package lin.M11_20150816;
//
///**
// * Created by Paul on 8/16/15.
// * http://www.lintcode.com/en/problem/kth-smallest-number-in-sorted-matrix/
// */
////Kth Smallest Number in Sorted Matrix
////
////        15% Accepted
////        Find the kth smallest number in at row and column sorted matrix.
////
////        Have you met this question in a real interview? Yes
////        Example
////        Given k = 4 and a matrix:
////
////        [
////        [1 ,5 ,7],
////        [3 ,7 ,8],
////        [4 ,8 ,9],
////        ]
////        return 5
////
////        Challenge
////        O(k log n), n is the maximal number in width and height.
//public class M401KthSmallestNumber {
//    /**
//     * @param matrix: a matrix of integers
//     * @param k: an integer
//     * @return: the kth smallest number in the matrix
//     */
//    public int kthSmallest(int[][] matrix, int k) {
//        // write your code here
//        if(matrix.length == 0 || matrix == null) {
//            return Integer.MAX_VALUE;
//        }
//        if(k > matrix.length){
//            return Integer.MAX_VALUE;
//        }
//
//
//
//    }
//}
//
//
//public class Point {
//    public int x, y, val;
//    public Point(int x, int y, int val) {
//        this.x = x;
//        this.y = y;
//        this.val = val;
//    }
//}
//
//Comparator<Point> comp = new Comparator<Point>() {
//    public int compare(Point left, Point right) {
//        return left.val - right.val;
//    }
//};
//
//    public int kthSmallest(int[][] matrix, int k) {
//        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
//            return 0;
//        }
//        if (k > matrix.length * matrix[0].length) {
//            return 0;
//        }
//        return horizontal(matrix, k);
//    }
//
//    private int horizontal(int[][] matrix, int k) {
//        Queue<Point> heap = new PriorityQueue<Point>(k, comp);
//        for (int i = 0; i < Math.min(matrix.length, k); i++) {
//            heap.offer(new Point(i, 0, matrix[i][0]));
//        }
//        for (int i = 0; i < k - 1; i++) {
//            Point curr = heap.poll();
//            if (curr.y + 1 < matrix[0].length) {
//                heap.offer(new Point(curr.x, curr.y + 1, matrix[curr.x][curr.y + 1]));
//            }
//        }
//        return heap.peek().val;
//    }
//
//    private int vertical(int[][] matrix, int k) {
//        Queue<Point> heap = new PriorityQueue<Point>(k, comp);
//        for (int i = 0; i < Math.min(matrix[0].length, k); i++) {
//            heap.offer(new Point(0, i, matrix[0][i]));
//        }
//        for (int i = 0; i < k - 1; i++) {
//            Point curr = heap.poll();
//            if (curr.x + 1 < matrix.length) {
//                heap.offer(new Point(curr.x + 1, curr.y, matrix[curr.x + 1][curr.y]));
//            }
//        }
//        return heap.peek().val;
//    }