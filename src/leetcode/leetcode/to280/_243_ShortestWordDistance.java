package leetcode.leetcode.to280;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>
 * answer link
 */
public class _243_ShortestWordDistance {
    public static int shortestDistance(String[] words, String word1, String word2) {
        int min = Integer.MAX_VALUE;
        int p1 = -1;
        int p2 = -1;
        for(int i = 0; i < words.length; i++) {
            if(words[i] == word1) {
                p1 = i;
            }
            if(words[i] == word2) {
                p2 = i;
            }
            if(p1 != -1 && p2 != -1) {
                min = Math.min(min, Math.abs(p1-p2));
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int a = shortestDistance(new String[]{"a", "b"}, "a", "b");
    }
}
