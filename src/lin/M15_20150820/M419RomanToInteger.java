package lin.M15_20150820;

/**
 * Created by Paul on 8/19/15.
 * http://www.cnblogs.com/springfor/p/3886459.html
 */
//Roman to Integer
//
//        41% Accepted
//        Given a roman numeral, convert it to an integer.
//
//        The answer is guaranteed to be within the range from 1 to 3999.
//
//        Have you met this question in a real interview? Yes
//        Example
//        IV -> 4
//
//        XII -> 12
//
//        XXI -> 21
//
//        XCIX -> 99
//
//        Clarification
//        What is Roman Numeral?
//
//        https://en.wikipedia.org/wiki/Roman_numerals
//        https://zh.wikipedia.org/wiki/%E7%BD%97%E9%A9%AC%E6%95%B0%E5%AD%97
//        http://baike.baidu.com/view/42061.htm
public class M419RomanToInteger {
    /**
     * @param s Roman representation
     * @return an integer
     */
    public int romanToInt(String s) {
        // Write your code here
        if(s == null || s.length() == 0) {
            return 0;
        }
        int number = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
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
                if(number >= 5000) {
                    number -= 1000;
                } else {
                    number += 1000;
                }
            }
        }
        return number;
    }
}
