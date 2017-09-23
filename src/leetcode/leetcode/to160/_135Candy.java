package leetcode.leetcode.to160;

import java.util.Arrays;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>https://leetcode.com/problems/candy/
 * answer link
 * http://www.cnblogs.com/springfor/p/3877120.html
 */
public class _135Candy {
    public static int candy(int[] ratings) {
        if(ratings == null || ratings.length == 0) {
            return 0;
        }

        int[] count = new int[ratings.length];
        count[0] = 1;
        for(int i = 1; i < ratings.length; i++) {
            count[i] = ratings[i] > ratings[i-1] ? count[i-1]+1 : 1;
        }
        int sum = 0;
        for(int i = ratings.length-1; i >= 1; i--) {
            sum += count[i];
            if(ratings[i] < ratings[i-1] && count[i] >= count[i-1]) {
                count[i-1] = count[i] + 1;
            }
        }

        sum += count[0];
        return sum;
    }

    public static void main(String[] args) {
        int a = candy(new int[]{1,2,1,3,6,1,2,4});
    }
}
