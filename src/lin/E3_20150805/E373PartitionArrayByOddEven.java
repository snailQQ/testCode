package lin.E3_20150805;

/**
 * Created by Paul on 8/5/15.
 * http://www.lintcode.com/en/problem/partition-array-by-odd-and-even/
 */
//Partition Array by Odd and Even
//
//        36% Accepted
//        Partition an integers array into odd number first and even number second.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given [1, 2, 3, 4], return [1, 3, 2, 4]
//
//        Challenge
//        Do it in-place.
//
//        Tags Expand
public class E373PartitionArrayByOddEven {
    /**
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
        // write your code here;
        for(int i = 0, j = nums.length -1; i < j;){
            if(nums[i] % 2 == 0 && nums[j] % 2 == 1) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
                continue;
            }
            if(nums[i] % 2 == 0 && nums[j] % 2 == 0){
                j--;
                continue;
            }
            if(nums[i] % 2 == 1) {
                i++;
                continue;
            }
        }
    }
}
