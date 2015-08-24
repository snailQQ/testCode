package lin.M17_20150822;

/**
 * Created by Paul on 8/22/15.
 */
//Sort Colors II
//
//        32% Accepted
//        Given an array of n objects with k different colors (numbered from 1 to k),
// sort them so that objects of the same color are adjacent, with the colors in the order 1, 2, ... k.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given colors=[3, 2, 2, 1, 4], k=4, your code should sort colors in-place to [1, 2, 2, 3, 4].
//
//        Note
//        You are not suppose to use the library's sort function for this problem.
//
//        Challenge
//        A rather straight forward solution is a two-pass algorithm using counting sort.
// That will cost O(k) extra memory. Can you do it without using extra memory?
public class M143SortColor2 {
    /**
     * @param colors: A list of integer
     * @param k: An integer
     * @return: nothing
     */
    public void sortColors2(int[] colors, int k) {
        // write your code here
        if(colors == null || colors.length == 0 || k <= 1) {
            return;
        }

        int start = -1;
        int end = colors.length;
        for (int round = 1; round*2 <= k; round++) {
            int leftColor = round;
            int rightColor = k - round + 1;
            for (int index = start+1; index < end; index++) {
                if (colors[index] == leftColor) {
                    colors[index] = colors[++start];
                    colors[start] = leftColor;
                } else if (colors[index] == rightColor) {
                    colors[index] = colors[--end];
                    colors[end] = rightColor;
                    index--;
                }
            }
        }
    }
}
