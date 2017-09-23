package leetcode.leetcode.to40;

import java.util.HashSet;

/**
 * Created by Paul on 11/4/15.
 * question link
 * <p/>
 * answer link
 */
public class _3LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==0)
            return 0;

        HashSet<Character> set = new HashSet<Character>();
        int max = 0;
        int walker = 0;
        int runner = 0;
        while(runner<s.length()){
            if(set.contains(s.charAt(runner))){
                if(max<runner-walker)
                    max = runner-walker;

                while(s.charAt(walker)!=s.charAt(runner)){
                    set.remove(s.charAt(walker));
                    walker++;
                }
                walker++;
            }else
                set.add(s.charAt(runner));

            runner++;
        }
        max = Math.max(max,runner-walker);
        return max;
    }

    public static void main(String[] args) {
        int a = lengthOfLongestSubstring("abcabcbb");
    }
}
