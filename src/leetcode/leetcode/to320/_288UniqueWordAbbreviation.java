package leetcode.leetcode.to320;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>
 * answer link
 */
public class _288UniqueWordAbbreviation {
    static HashMap<String, HashSet<String>> abbr_map = new HashMap<String, HashSet<String>>();

    public _288UniqueWordAbbreviation(String[] dictionary) {
        for (String word : dictionary) {
            if (word == null || word.length() <= 2)
                continue;
            String abbr_word = getAbbrStr(word);
            if (abbr_map.containsKey(abbr_word)) {
                abbr_map.get(abbr_word).add(word);
            } else{
                HashSet<String> item = new HashSet<String> ();
                item.add(word);
                abbr_map.put(abbr_word, item);
            }
        }
    }


    public static boolean isUnique(String word) {
        if (word == null || word.length() <= 2)
            return true;
        String abbr_word = getAbbrStr(word);
        if (abbr_map.containsKey(abbr_word)) {
            if (abbr_map.get(abbr_word).size() >= 2)
                return false;
            if (!abbr_map.get(abbr_word).contains(word))
                return false;
        }
        return true;
    }


    private static String getAbbrStr(String s) {
        int len = s.length();
        return s.substring(0, 1) + (len - 2) + s.substring(len - 1);
    }

    public static void main(String[] args) {
        _288UniqueWordAbbreviation a = new _288UniqueWordAbbreviation(new String[]{});
        a.isUnique("hello");
    }
}
