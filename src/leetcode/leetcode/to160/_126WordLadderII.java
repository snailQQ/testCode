package leetcode.leetcode.to160;

import java.util.*;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>
 * answer link
 *
 * 这种问题 一般不问复杂度
 * O(x*N + M)
 * x是答案的个数，n是点的个数，m是边的个数
 */
public class _126WordLadderII {
    public static List<List<String>> findLadders(String beginWord, String endWord, Set<String> wordList) {
        List<List<String>> rst = new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        Map<String, Integer> distance = new HashMap<String, Integer>();

        wordList.add(beginWord);
        wordList.add(endWord);
        bfs(map, distance, beginWord, endWord, wordList);
        List<String> path = new ArrayList<String>();
        dfs(rst, path, distance, beginWord, endWord, wordList, map);
        return rst;
    }

    private static void dfs(List<List<String>> rst, List<String> path, Map<String, Integer> distance, String curWord, String endWord, Set<String> wordList, Map<String, List<String>> map) {
        path.add(curWord);
        if(curWord.equals(endWord)) {
            rst.add(new ArrayList<String>(path));
        } else {
            for(String nextWord : map.get(curWord)) {
                if(distance.containsKey(nextWord) && distance.get(curWord) == distance.get(nextWord) + 1) {
                    dfs(rst, path, distance, nextWord, endWord, wordList, map);
                }
            }
        }
        path.remove(path.size() - 1);

    }

    private static void bfs(Map<String, List<String>> map, Map<String, Integer> distance, String beginWord, String endWord, Set<String> wordList) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer(endWord);
        distance.put(endWord, 0);
        for(String s : wordList) {
            map.put(s, new ArrayList<String>());
        }
        while(!queue.isEmpty()) {
            String str = queue.poll();
            List<String> nextList = findNext(str, wordList);
            for(String nextStr : nextList) {
                map.get(nextStr).add(str);
                if(!distance.containsKey(nextStr)) {
                    distance.put(nextStr, distance.get(str) + 1);
                    queue.offer(nextStr);
                }
            }
        }
    }

    private static List<String> findNext(String str, Set<String> wordList) {
        List<String> list = new ArrayList<String>();
        for(int i = 0; i < str.length(); i++) {
            for(char c = 'a'; c <= 'z'; c++) {
                if(c != str.charAt(i)) {
                    String nextStr = str.substring(0, i) + c + str.substring(i+1);
                    if(wordList.contains(nextStr)) {
                        list.add(nextStr);
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("a");
        set.add("b");
        set.add("c");

        List<List<String>> list = findLadders("a", "b", set);
    }
}
