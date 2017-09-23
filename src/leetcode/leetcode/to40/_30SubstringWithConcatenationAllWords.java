package leetcode.leetcode.to40;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>
 * answer link
 * http://www.cnblogs.com/springfor/p/3872516.html
 */
public class _30SubstringWithConcatenationAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list = new ArrayList<Integer>();
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        HashMap<String, Integer> find = new HashMap<String, Integer>();
        int m = words.length;
        int n = words[0].length();
        for(int i = 0; i < m; i++) {
            if(hm.containsKey(words[i])) {
                hm.put(words[i], hm.get(words[i]) + 1);
            } else {
                hm.put(words[i], 1);
            }
        }

        for(int i = 0; i <= s.length() - m * n; i++) {
            find.clear();
            int j;
            for(j = 0; j < m; j++) {
                int k = i + j * n;
                String str = s.substring(k, k+n);
                if(!hm.containsKey(str)) {
                    break;
                }
                if(!find.containsKey(str)) {
                    find.put(str, 1);
                } else {
                    find.put(str, find.get(str) + 1);
                }
                if(find.get(str) > hm.get(str)) {
                    break;
                }
            }
            if(j == m) {
                list.add(i);
            }
        }
        return list;
    }
}
