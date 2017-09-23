package leetcode.leetcode.to120;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>https://leetcode.com/problems/merge-sorted-array/
 * answer link
 */
public class _88MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        int p1 = m - 1;
        int p2 = n - 1;
        while(p1 >= 0 && p2 >= 0) {
            if(nums1[p1] > nums2[p2]) {
                nums1[index] = nums1[p1];
                p1--;
            } else {
                nums1[index] = nums2[p2];
                p2--;
            }
            index--;
        }
        while(p2 >= 0) {
            nums1[index] = nums2[p2];
            p2--;
            index--;
        }
    }
}
