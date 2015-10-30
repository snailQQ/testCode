package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Paul on 10/16/15.
 */
public class LeetEWordPattern290 {
    public static boolean wordPattern(String pattern, String str) {
        if (pattern == null || str == null) {
            return false;
        }
        char[] patterns = pattern.toCharArray();
        String[] strs = str.split(" ");
        if (patterns.length != strs.length) {
            return false;
        }
        HashMap<Character, String> map = new HashMap<Character, String>();
        for (int i=0; i<patterns.length; i++) {
            if (map.containsKey(patterns[i])) {
                if (!map.get(patterns[i]).equals(strs[i])) {
                    return false;
                }
            } else if (map.containsValue(strs[i])) {
                return false;
            }
            map.put(patterns[i], strs[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        boolean a = wordPattern("abba", "dog cat cat fish");
    }
}
