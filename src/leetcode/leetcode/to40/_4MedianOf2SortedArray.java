package leetcode.leetcode.to40;

/**
 * Created by Paul on 10/27/15.
 */
//question
//https://leetcode.com/problems/median-of-two-sorted-arrays/
//answer
//http://www.cnblogs.com/springfor/p/3861890.html


public class _4MedianOf2SortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null) {
            return 0.0;
        }
        int m = nums1.length;
        int n = nums2.length;
        int total = m + n;
        //要判断m+n的长度是奇数还是偶数，如果是奇数就是当中那个数字是中位数，如果是偶数就是当中两个数字的平均数是中位数。要注意double
        //返回类型

        if(total % 2 == 1) {
            return (double) findMedian(nums1, 0, m-1, nums2, 0, n-1, total / 2 + 1);
        } else {
            int x = findMedian(nums1, 0, m-1, nums2, 0, n-1, total / 2);
            int y = findMedian(nums1, 0, m-1, nums2, 0, n-1, total / 2 + 1);
            return (x + y) / 2.0;
        }
    }

    private static int findMedian(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k) {
        int m = end1 - start1 + 1;
        int n = end2 - start2 + 1;

//        因为下面的找中间的数字，所以要保证m比n小
        if(m > n) {
            return findMedian(nums2, start2, end2, nums1, start1, end1, k);
        }
//        如果m 等于 0 说明第一个数组已经到最后了，还没有k，那么只要在第二个数组里找就可以了
        if(m == 0) {
            return nums2[k - 1];
        }
//        如果k 等于1 说明 下一个数字就是中位数，那么比较两个里的最小值就可以了
        if(k == 1) {
            return Math.min(nums1[start1], nums2[start2]);
        }

        int mid1 = Math.min(k/2, m); //可能k除以2以后的，这个数字大于m说明k在第二个数组中
        int mid2 = k - mid1;
        if(nums1[start1 + mid1 - 1] > nums2[start2 + mid2 - 1]) {
            return findMedian(nums1, start1, end1, nums2, start2+mid2, end2, k-mid2);
        } else if(nums1[start1 + mid1 - 1] < nums2[start2 + mid2 - 1]) {
            return findMedian(nums1, start1+mid1, end1, nums2, start2, end2, k-mid1);
        } else {
            return nums1[start1 + mid1 - 1];
        }

    }

    public static void main(String[] args) {
        int[] a = new int[]{1};
        int[] b = new int[]{2,3,4,5,6};
        double s = findMedianSortedArrays(a, b);
    }
}
