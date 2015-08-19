package lin.M14_20150819;

/**
 * Created by Paul on 8/18/15.
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

public class M52NextPermutation {
    /**
     * @param nums: an array of integers
     * @return: return nothing (void), do not return anything, modify nums in-place instead
     */
    public static int[] nextPermutation(int[] nums) {
        // write your code here
        if(nums == null || nums.length == 0) {
            return nums;
        }

        int pos = 0;

        for(int i = nums.length - 1; i > 0; i--) {
            if(nums[i] > nums[i-1]) {
                continue;
            }else{
               pos = i;
                break;
            }
        }

        int[] returnArray = new int[nums.length];
        for(int i = 0; i < pos; i++) {
            returnArray[i] = nums[i];
        }

        for(int i = pos, j = nums.length - 1; i < nums.length; i++, j--) {
            returnArray[i] = nums[j];
        }

        return returnArray;
    }

    public static void main(String [] args) {
        int[] a = {1,1,2};
        int [] b = nextPermutation(a);
    }
}


//if(num==null || num.length==0)
//        return num;
//        int i = num.length-2;
//        while(i>=0 && num[i]>=num[i+1])
//        i--;
//
//        if(i>=0){
//        int j=i+1;
//        while(j<num.length && num[j]>num[i])
//        j++;
//        j--;
//        swap(num,i,j);
//        }
//        reverse(num, i+1,num.length-1);
//        return num;
//        }
//private void swap(int[] num, int i, int j){
//        int tmp = num[i];
//        num[i] = num[j];
//        num[j] = tmp;
//        }
//private void reverse(int[] num, int i, int j){
//        while(i < j)
//        swap(num, i++, j--);
//        }