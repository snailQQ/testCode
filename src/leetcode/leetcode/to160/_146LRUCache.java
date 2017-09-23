package leetcode.leetcode.to160;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>
 * answer link
 * https://leetcode.com/discuss/42891/probably-the-best-java-solution-extend-linkedhashmap
 */
public class _146LRUCache {
    private Map<Integer, Integer> map;

    public  _146LRUCache(final int capacity) {
        map = new LinkedHashMap<Integer, Integer>(16, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry eldest) {
              return size() > capacity;
            }
        };
    }

    public int get(int key) {
//        return map.getOrDefault(key, -1);
        if(!map.containsKey(key)) { return -1; }
        return map.get(key);
    }

    public void set(int key, int value) {
        map.put(key,value);
    }

}
