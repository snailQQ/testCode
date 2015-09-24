package lin.M18_20150823;

import java.util.*;

/**
 * Created by Paul on 8/23/15.
 * http://www.lintcode.com/en/problem/word-ladder/
 * http://www.programcreek.com/2012/12/leetcode-word-ladder/
 * http://www.cnblogs.com/springfor/p/3893499.html#3209156
 */
//Word Ladder
//
//        21% Accepted
//        Given two words (start and end), and a dictionary, find the length of shortest transformation sequence from start to end, such that:
//
//        Only one letter can be changed at a time
//        Each intermediate word must exist in the dictionary
//        Have you met this question in a real interview? Yes
//        Example
//        Given:
//        start = "hit"
//        end = "cog"
//        dict = ["hot","dot","dog","lot","log"]
//        As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
//        return its length 5.
//
//        Note
//        Return 0 if there is no such transformation sequence.
//        All words have the same length.
//        All words contain only lowercase alphabetic characters.
public class M120WordLadder {
    /**
     * @param start, a string
     * @param end, a string
     * @param dict, a set of string
     * @return an integer
     */
    public static int ladderLength(String start, String end, Set<String> dict) {
        // write your code here
        if(start == null || start.length() != end .length() || dict.isEmpty() || dict.size() == 0) {
            return 0;
        }

        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        Queue<String> queue = new LinkedList<String>();
        hm.put(start, 1);
        queue.offer(start);
        while(!queue.isEmpty()) {
            String word = queue.poll();

            for(int i = 0; i < word.length(); i++) {
                char[] wordArray = word.toCharArray();
                for(char j = 'a'; j <='z'; j++) {
                    wordArray[i] = j;
                    String temp = new String(wordArray);
                    if(temp.equals(end)) {
                        int returnv = hm.get(word) + 1;
                        return returnv;
                    } else if(!temp.equals(word) && dict.contains(temp) && !hm.containsKey(temp)) {
                        hm.put(temp, hm.get(word) + 1);
                        queue.offer(temp);
                    }
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Set<String> aSet = new HashSet<String>();
        aSet.add("hot");
        aSet.add("cog");
        aSet.add("dog");
        aSet.add("tot");
        aSet.add("hog");
        aSet.add("hop");
        aSet.add("pot");
        aSet.add("dot");
        int a = ladderLength("hot", "dog", aSet);


    }
}
