package lin.M9_20150813;

/**
 * Created by Paul on 8/12/15.
 * http://www.lintcode.com/en/problem/find-minimum-in-rotated-sorted-array-ii/
 * http://blog.csdn.net/linhuanmars/article/details/40449299
 * 解题思路如果mid 等于两边，两边向中间进一位，但是注意一次只能进一位 这是二分法
 * 另外还可以遍历，复杂度o n
 * 还可以排序再找第一个 nlogn
 */
//Find Minimum in Rotated Sorted Array II
//
//        37% Accepted
//        Suppose a sorted array is rotated at some pivot unknown to you beforehand.
//
//        (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
//
//        Find the minimum element.
//
//        The array may contain duplicates.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given [4,4,5,6,7,0,1,2] return 0
public class M160FindMinRotatedSortedArray2 {
    /**
     * @param num: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] num) {
        // write your code here
        if(num == null || num.length == 0) {
            return Integer.MIN_VALUE;
        }

        int start = 0;
        int end = num.length - 1;

        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if(num[mid] == num[start]) {
                start++;
            }else if(num[mid] == num[end]) {
                end--;
            }else if(num[mid] > num[end]) {
                start = mid;
            }else {
                end = mid;
            }
        }

        return Math.min(num[start], num[end]);
    }
}
