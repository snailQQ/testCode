package lin.M14_20150819;

/**
 * Created by Paul on 8/18/15.
 * http://www.lintcode.com/en/problem/next-permutation/
 * http://www.cnblogs.com/springfor/p/3896245.html
 */
//Next Permutation
//
//        24% Accepted
//        Given a list of integers, which denote a permutation.
//
//        Find the next permutation in ascending order.
//
//        Have you met this question in a real interview? Yes
//        Example
//        For [1,3,2,3], the next permutation is [1,3,3,2]
//
//        For [4,3,2,1], the next permutation is [1,2,3,4]
//
//        Note
//        The list may contains duplicate integers.
//


//这道题是给定一个数组和一个排列，求下一个排列。算法上其实没有什么特别的地方，主要的问题是经常不是一见到这个题就能马上理清思路。下面我们用一个例子来说明，比如排列是(2,3,6,5,4,1)，求下一个排列的基本步骤是这样：
//        1) 先从后往前找到第一个不是依次增长的数，记录下位置p。比如例子中的3，对应的位置是1;
//        2) 接下来分两种情况：
//        (1) 如果上面的数字都是依次增长的，那么说明这是最后一个排列，下一个就是第一个，其实把所有数字反转过来即可(比如(6,5,4,3,2,1)下一个是(1,2,3,4,5,6));
//        (2) 否则，如果p存在，从p开始往后找，找找找，找到第一个比他小的数，然后两个调换位置，比如例子中的4。调换位置后得到(2,4,6,5,3,1)。最后把p之后的所有数字倒序，比如例子中得到(2,4,1,3,5,6), 这个即是要求的下一个排列。
//        以上方法中，最坏情况需要扫描数组三次，所以时间复杂度是O(3*n)=O(n)，空间复杂度是O(1)。

public class M52NextPermutation {
    /**
     * @param nums: an array of integers
     * @return: return nothing (void), do not return anything, modify nums in-place instead
     */
    public static int[] nextPermutation(int[] nums) {
        // write your code here
        if(nums == null || nums.length <= 1) {
            return nums;
        }

        int pos = -1;

        for(int i = nums.length - 2; i >= -1; i--) {
            if(nums[i + 1] >= nums[i]) {
                continue;
            }else{
                pos = i;
                break;
            }
        }


        int[] returnArray = new int[nums.length];
        if(pos == -1) {
            for(int i = 0; i < nums.length; i++) {
                returnArray[i] = nums[nums.length - 1 - i];
            }
        } else {
            for(int i = pos+1; i < nums.length - 1; i++) {
                if(nums[pos] <= nums[i+1]) {
                    swap(nums, pos, i);
                    break;
                }
            }
            if(pos == 0){
                return nums;
            } else {
                for(int i = 0; i < pos; i++) {
                    returnArray[i] = nums[i];
                }

                for(int i = pos, j = nums.length - 1; i < nums.length; i++, j--) {
                    returnArray[i] = nums[j];
                }
            }


        }

        return returnArray;


    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] num, int i, int j){
        while(i < j)
            swap(num, i++, j--);
    }

    public static void main(String [] args) {
        int[] a = {1,2,1};
        int [] b = nextPermutation(a);
    }

//    if(nums==null || nums.length==0)
//            return nums;
//    int i = nums.length-2;
//    while(i>=0 && nums[i]>=nums[i+1])
//    i--;
//
//    if(i>=0){
//        int j=i+1;
//        while(j<nums.length && nums[j]>nums[i])
//            j++;
//        j--;
//        swap(nums,i,j);
//    }
//    reverse(nums, i+1,nums.length-1);
//    return nums;
}




