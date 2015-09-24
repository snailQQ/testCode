package lin.M17_20150822;

/**
 * Created by Paul on 8/21/15.
 * http://www.lintcode.com/en/problem/sort-colors/
 */

//Sort Colors
//
//        33% Accepted
//        Given an array with n objects colored red, white or blue,
// sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
//
//        Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given [1, 0, 1, 2], return [0, 1, 1, 2].
//
//        Note
//        You are not suppose to use the library's sort function for this problem.
//
//        Challenge
//        A rather straight forward solution is a two-pass algorithm using counting sort. First,
// iterate the array counting number of 0's, 1's, and 2's,
// then overwrite array with total number of 0's, then 1's and followed by 2's.
//
//        Could you come up with an one-pass algorithm using only constant space?
public class M148SortColors {
    /**
     * @param nums: A list of integer which is 0, 1 or 2
     * @return: nothing
     */
    public static void sortColors(int[] nums) {
        // write your code here
        if(nums == null || nums.length == 0) {
            return;
        }

        int pR = -1;
        int pB = nums.length;
        int i = 0;
        while(i < pB) {
            if(nums[i] == 0) {
                if(i == pR + 1) {
                    pR++;
                    i++;
                }else{
                    swap(nums, i, ++pR);
                }
            }else if(nums[i] == 2) {
                swap(nums, i, --pB);
            }else{
                i++;
            }
        }
    }

    private static void swap(int[] nums, int p1, int p2) {
        int tmp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = tmp;
    }

    public static void main(String[] args) {
        int[] a = {0,2,2,2,2,1,0,1,0,0,0,1,0,2,0};
        sortColors(a);
    }
}
