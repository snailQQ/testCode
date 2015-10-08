package leetcode;

import java.util.Arrays;

/**
 * Created by Paul on 10/5/15.
 */
public class LeetMHIndex274 {
    public static int hIndex(int[] citations) {
        if(citations == null || citations.length == 0) {
            return 0;
        }



        Arrays.sort(citations);
        int result = 0;
        for(int i = citations.length - 1; i >= 0 ; i--) {
            if(result >= citations[i]) {
                return result;
            }
            result++;
        }

        return result;
    }

    public static void main(String[] args) {
        int a = hIndex(new int[]{0,1,1,1,1,2,3,4});
    }
}
