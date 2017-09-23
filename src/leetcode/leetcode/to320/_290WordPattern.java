package leetcode.leetcode.to320;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>
 * answer link
 */
public class _290WordPattern {
    public boolean wordPattern(String pattern, String str) {
        if((pattern == null && str == null) || (pattern.length() == 0 && str.length() == 0)) {
            return true;
        }
        if(pattern == null || str == null || pattern.length() == 0 || str.length() == 0) {
            return false;
        }
        String[] strs = str.split(" ");

        Map<Character, String> hm = new HashMap<Character, String>();
        if(strs.length != pattern.length()) {
            return false;
        }
        for(int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if(hm.containsKey(c)) {
                if(!hm.get(c).equals(strs[i])) {
                    return false;
                }
            } else if(hm.containsValue(strs[i])){
                return false;
            }
            hm.put(c, strs[i]);
        }
        return true;
    }
}
