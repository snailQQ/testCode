package leetcode.leetcode.to200;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>https://leetcode.com/problems/maximum-gap/
 * answer link
 * http://www.programcreek.com/2014/03/leetcode-maximum-gap-java/
 * http://buttercola.blogspot.com/2015/08/leetcode-maximum-gap.html
 */
public class _164MaximumGap {
    private static class Bucket {
        int min;
        int max;
        public Bucket() {
            this.min = -1;
            this.max = -1;
        }
    }

    public static int maximumGap(int[] nums) {
        if(nums == null || nums.length < 2) {
            return 0;
        }

        //找最大最小值
        int max = nums[0];
        int min = nums[0];
        for(int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        //构建桶数组
        Bucket[] buckets = new Bucket[nums.length+1];
        for(int i = 0; i < buckets.length; i++) {
            buckets[i] = new Bucket();
        }

        double interval = (double) nums.length / (max - min);
        for(int i = 0; i < nums.length; i++) {
            int index = (int) ((nums[i] - min) * interval);

            if(buckets[index].min == -1) {
                buckets[index].min = nums[i];
                buckets[index].max = nums[i];
            } else {
                buckets[index].min = Math.min(buckets[index].min, nums[i]);
                buckets[index].max = Math.max(buckets[index].max, nums[i]);
            }
        }

        int result = 0;
        int prev = buckets[0].max;
        for(int i = 1; i < buckets.length; i++) {
            if(buckets[i].min != -1) {
                result = Math.max(result, buckets[i].min - prev);
                prev = buckets[i].max;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int a = maximumGap(new int[]{1,10000000});
    }
}
