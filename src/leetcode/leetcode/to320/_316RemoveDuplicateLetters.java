package leetcode.leetcode.to320;

/**
 * Created by Paul on 12/9/15.
 * question link
 * <p/>
 * answer link
 * https://leetcode.com/discuss/73761/an-o-n-recursive-greedy-solution
 */
public class _316RemoveDuplicateLetters {
    public static String removeDuplicateLetters(String s) {
        int[] cnt = new int[26];
        boolean[] isCandidate = new boolean[26];
        for (int i = 0; i < s.length(); i++) cnt[s.charAt(i) - 'a']++;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            isCandidate[ch - 'a'] = true;
            if (--cnt[ch - 'a'] == 0) break;
        }
        for (int i = 0; i < 26; i++)
            if (isCandidate[i]) {
                char ch = (char) (i + 'a');
                for (int j = 0; j < s.length(); j++)
                    if (s.charAt(j) == ch) return ch + removeDuplicateLetters(s.substring(j + 1).replaceAll("" + ch, ""));
            }
        return "";
    }

    public static void main(String[] args) {
        String a = removeDuplicateLetters("cbacdcbc");
    }
}
