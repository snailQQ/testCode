package leetcode.leetcode.to40;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Paul on 10/29/15.
 * question link
 * <p/>https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 *
 * Given a digit string, return all possible letter combinations that the number could represent.

 A mapping of digit to letters (just like on the telephone buttons) is given below.



 Input:Digit string "23"
 Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 Note:
 Although the above answer is in lexicographical order, your answer could be in any order you want.
 * answer link
 */
public class _17LetterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<String>();
        if(digits == null || digits.length() == 0) {
            return list;
        }
        HashMap<Character, char[]> hm = new HashMap<Character, char[]>();
        hm.put('0', new char[]{});
        hm.put('1', new char[]{});
        hm.put('2', new char[]{'a','b','c'});
        hm.put('3', new char[]{'d','e','f'});
        hm.put('4', new char[]{'g','h','i'});
        hm.put('5', new char[]{'j','k','l'});
        hm.put('6', new char[]{'m','n','o'});
        hm.put('7', new char[]{'p','q','r','s'});
        hm.put('8', new char[]{'t','u','v'});
        hm.put('9', new char[]{'w','x','y','z'});

        StringBuilder sb = new StringBuilder();
        helper(digits, list, hm, sb);
        return list;
    }

    public static List<String> letterCombinations2(String digits) {
        List<String> result = new ArrayList<String>();
        if(digits == null || digits.length() == 0) {
            return result;
        }
        String[] letters = new String[]{"","","abc","def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        StringBuilder sb = new StringBuilder();

        dfs(result, digits, letters, 0, sb);

        for(String s : result) {
            System.out.println(s);
        }

        return result;

    }

    private static void dfs(List<String> result, String digits, String[] letters, int index, StringBuilder sb) {
        if(index == digits.length()) {
            result.add(sb.toString());
            return;
        }

        for(int i = 0; i < letters[digits.charAt(index)-'0'].length(); i++) {
            sb.append(letters[digits.charAt(index)-'0'].charAt(i));
            dfs(result, digits, letters, index + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    private void helper(String digits, List<String> list, HashMap<Character, char[]> hm, StringBuilder sb) {
        if(sb.length() == digits.length()) {
            list.add(sb.toString());
            return;
        }

        for(char c : hm.get(digits.charAt(sb.length()))) {
            sb.append(c);
            helper(digits, list, hm, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static void main(String[] args) {
        letterCombinations2("23");
    }
}
