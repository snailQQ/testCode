package lin.M10_20150814;

import java.util.Arrays;

/**
 * Created by Paul on 8/13/15.
 * http://www.lintcode.com/en/problem/integer-to-roman/
 * http://www.cnblogs.com/springfor/p/3886459.html
 */
//Integer to Roman
//
//        42% Accepted
//        Given an integer, convert it to a roman numeral.
//
//        The number is guaranteed to be within the range from 1 to 3999.
//
//        Have you met this question in a real interview? Yes
//        Example
//        4 -> IV
//
//        12 -> XII
//
//        21 -> XXI
//
//        99 -> XCIX
//
//        more examples at: http://literacy.kent.edu/Minigrants/Cinci/romanchart.htm
//
//        Clarification
//        What is Roman Numeral?
//
//        https://en.wikipedia.org/wiki/Roman_numerals
//        https://zh.wikipedia.org/wiki/%E7%BD%97%E9%A9%AC%E6%95%B0%E5%AD%97
//        http://baike.baidu.com/view/42061.htm
public class M418IntegerToRoman {
    /**
     * @param n The integer
     * @return Roman representation
     */
    public String intToRoman(int n) {
        // Write your code here
        if(n <= 0) {
            return "";
        }
        if(n >= 1000) {
            return "M" + intToRoman(n - 1000);
        }
        if(n >= 900) {
            return "CM" + intToRoman(n - 900);
        }
        if(n >= 500) {
            return "D" + intToRoman(n - 500);
        }
        if(n >= 400) {
            return "CD" + intToRoman(n - 400);
        }
        if(n >= 100) {
            return "C" + intToRoman(n - 100);
        }
        if(n >= 90) {
            return "IC" + intToRoman(n - 90);
        }
        if(n >= 50) {
            return "L" + intToRoman(n - 50);
        }
        if(n >= 40) {
            return "XL" + intToRoman(n - 40);
        }
        if(n >= 10) {
            return "X" + intToRoman(n - 10);
        }
        if(n >= 9) {
            return "IX" + intToRoman(n - 9);
        }
        if(n >= 5) {
            return "V" + intToRoman(n - 5);
        }
        if(n >= 4) {
            return "IV" + intToRoman(n - 4);
        }
        if(n >= 1) {
            return "I" + intToRoman(n - 1);
        }
        return "";



    }
}
