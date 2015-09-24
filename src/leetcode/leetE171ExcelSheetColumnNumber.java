package leetcode;

import java.util.HashMap;

/**
 * Created by Paul on 9/23/15.
 * https://leetcode.com/problems/excel-sheet-column-number/
 * http://www.programcreek.com/2014/03/leetcode-excel-sheet-column-number-java/
 */

//Excel Sheet Column Number My Submissions Question Solution
//        Total Accepted: 43697 Total Submissions: 118223 Difficulty: Easy
//        Related to question Excel Sheet Column Title
//
//        Given a column title as appear in an Excel sheet, return its corresponding column number.
//
//        For example:
//
//        A -> 1
//        B -> 2
//        C -> 3
//        ...
//        Z -> 26
//        AA -> 27
//        AB -> 28
//        Credits:
//        Special thanks to @ts for adding this problem and creating all test cases.
//
//        Hide Tags Math
//        Hide Similar Problems (E) Excel Sheet Column Title

public class leetE171ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }

        int pos = s.length() - 1;
        int power = 0;
        int sum = 0;

        while(pos >= 0) {
            char c = s.charAt(pos);
            sum += (int) Math.pow(26, power) * (c - 'A' + 1);
            pos--;
            power++;
        }
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        return sum;
    }
}
