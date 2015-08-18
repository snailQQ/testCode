package lin.M12_20150817;

import java.util.Arrays;

/**
 * Created by Paul on 8/17/15.
 * http://www.lintcode.com/en/problem/longest-consecutive-sequence/
 */
//Longest Consecutive Sequence
//
//        32% Accepted
//        Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given [100, 4, 200, 1, 3, 2],
//        The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
//
//        Clarification
//        Your algorithm should run in O(n) complexity.
public class M124LongestConsecutiveSequence {
    /**
     * @param nums: A list of integers
     * @return an integer
     */
    public static int longestConsecutive(int[] num) {
        // write you code here
        int length = 0;
        if(num == null || num.length == 0) {
            return 0;
        }

        Arrays.sort(num);
        int flag = num[0];
        length++;
        int max = length;

        for(int i = 1; i < num.length; i++) {
            if(num[i] == flag) {
                continue;
            }
            if(num[i] == flag + 1) {
                length++;
                flag = num[i];
            }else{
                if(max < length){
                    max = length;
                }
                flag = num[i];
                length = 1;
            }
        }
        return Math.max(max,length);
    }

    public static void main(String [] args) {
        int[] a = {100, 4, 200, 1, 3, 2};
        int b = longestConsecutive(a);
    }
}
