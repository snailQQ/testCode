package leetcode.leetcode.to280;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>
 * answer link
 */
public class _241DifferentWaysAddParentheses {
    public static List<Integer> diffWaysToCompute(String input) {
        List<Integer> list = new ArrayList<Integer>();
        if(input == null || input.length() == 0) {
            return list;
        }
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(!Character.isDigit(c)) {
                List<Integer> left = diffWaysToCompute(input.substring(0, i));
                List<Integer> right = diffWaysToCompute(input.substring(i+1));

                for(Integer m : left) {
                    for(Integer n : right) {
                        if(c == '+') {
                            list.add(m + n);
                        } else if(c == '-') {
                            list.add(m - n);
                        } else if(c == '*') {
                            list.add(m * n);
                        }
                    }
                }
            }
        }
        if(list.size() == 0) {
            list.add(Integer.parseInt(input));
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = diffWaysToCompute("2*3-4*5");
    }
}
