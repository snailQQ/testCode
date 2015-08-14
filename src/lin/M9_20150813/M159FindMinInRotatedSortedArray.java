package lin.M9_20150813;

/**
 * Created by Paul on 8/12/15.
 * http://www.lintcode.com/en/problem/find-minimum-in-rotated-sorted-array/
 */
//Find Minimum in Rotated Sorted Array
//
//        33% Accepted
//        Suppose a sorted array is rotated at some pivot unknown to you beforehand.
//
//        (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
//
//        Find the minimum element.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given [4, 5, 6, 7, 0, 1, 2] return 0
//
//        Note
//        You may assume no duplicate exists in the array.


public class M159FindMinInRotatedSortedArray {
    /**
     * @param num: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] num) {
        // write your code here
        if(num == null || num.length==0)
            return 0;
        int l = 0;
        int r = num.length-1;
        int min = num[0];
        while(l<r-1)
        {
            int m = (l+r)/2;
            if(num[l]<num[m])
            {
                min = Math.min(num[l],min);
                l = m+1;
            }
            else if(num[l]>num[m])
            {
                min = Math.min(num[m],min);
                r = m-1;
            }
            else
            {
                l++;
            }
        }
        min = Math.min(num[r],min);
        min = Math.min(num[l],min);
        return min;
    }
}
