package leetcode.leetcode.to320;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>
 * answer link
 */
public class _293FlipGame {
    public static List<String> generatePossibleNextMoves(String s) {
        List<String> list = new ArrayList<String>();
        if(s == null || s.length() < 2) {
            return list;
        }
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == '+' && s.charAt(i-1) == '+') {
                list.add(s.substring(0, i-1) + "--" + s.substring(i+1, s.length()));

            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> list = generatePossibleNextMoves("+++++++++++++++++");
        for(String s : list) {
            System.out.println(s);
        }
    }
}
