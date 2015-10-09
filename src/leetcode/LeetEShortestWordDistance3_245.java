package leetcode;

/**
 * Created by Paul on 10/1/15.
 */
public class LeetEShortestWordDistance3_245 {
    public static int shortestWordDistance(String[] words, String word1, String word2) {
        int posA = -1;
        int posB = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (word.equals(word1)) {
                posA = i;
            } else if (word.equals(word2)) {
                posB = i;
            }

            if (posA != -1 && posB != -1 && posA != posB) {
                minDistance = Math.min(minDistance, Math.abs(posA - posB));
            }

            if (word1.equals(word2)) {
                posB = posA;
            }
        }

        return minDistance;

    }

//    public static void main(String[] args) {
//
//    }
}
