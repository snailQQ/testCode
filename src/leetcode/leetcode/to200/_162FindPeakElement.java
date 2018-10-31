package leetcode.leetcode.to200;

/**
 * Created by Paul on 11/17/15.
 * question link
 * A peak element is an element that is greater than its neighbors.

 Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.

 The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

 You may imagine that num[-1] = num[n] = -∞.

 For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.

 click to show spoilers.

 Note:
 Your solution should be in logarithmic complexity.

 Credits:
 Special thanks to @ts for adding this problem and creating all test cases.
 * <p/>https://leetcode.com/problems/find-peak-element/
 * answer link
 */
public class _162FindPeakElement {
    public static  int findPeakElement(int[] num) {

        int length = num.length;
        int left = 0;
        int right = length-1;

        int a=0;
        while(left<=right){   //左右开工找peak，直到两个element重合为止
            if(left==right){
                a = left;
                break;
            }
            int mid = (left+right)/2;

            if(num[mid]<num[mid+1]){
                left = mid+1;
            }else{
                right = mid;
            }

        }
        return a;
    }

    public static int findPeakElement2(int[] nums) {
        if(nums == null || nums.length == 0) {
            return Integer.MIN_VALUE;
        }
        if(nums.length == 1) {
            return nums[0];
        }
        int start = 0;
        int end = nums.length - 1;
        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] < nums[mid + 1]) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if(nums[start] > nums[end]) {
            return start;
        } else {
            return end;
        }

    }

    public static void main(String[] args) {

//        int a = findPeakElement2(new int[]{1,2,10,4,5,9,7});
        int b = findPeakElement2(new int[]{1,6,5,4,3,2,1});
        System.out.println(b);
    }
}
