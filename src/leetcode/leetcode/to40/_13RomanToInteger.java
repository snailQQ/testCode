package leetcode.leetcode.to40;

/**
 * Created by Paul on 10/29/15.
 * question link
 * <p/>https://leetcode.com/problems/roman-to-integer/
 * answer link
 */
public class _13RomanToInteger {
    public int romanToInt(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        int p = s.length()-1;
        int number = 0;
        while(p >= 0) {
            char c = s.charAt(p);
            if(c == 'I') {
                if(number >= 5) {
                    number -= 1;
                } else {
                    number += 1;
                }
            } else if(c == 'V') {
                number += 5;
            } else if(c == 'X') {
                if(number >= 50) {
                    number -= 10;
                } else {
                    number += 10;
                }
            } else if(c == 'L') {
                number += 50;
            } else if(c == 'C') {
                if(number >= 500) {
                    number -= 100;
                } else {
                    number += 100;
                }
            } else if(c == 'D') {
                number += 500;
            } else if(c == 'M') {
                number += 1000;
            }
            p--;
        }
        return number;
    }
}
