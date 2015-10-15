package leetcode;

import java.util.Stack;

//Basic Calculator II My Submissions Question Solution 
//Total Accepted: 11046 Total Submissions: 53773 Difficulty: Medium
//Implement a basic calculator to evaluate a simple expression string.
//
//The expression string contains only non-negative integers, +, -, *, / operators and empty spaces . The integer division should truncate toward zero.
//
//You may assume that the given expression is always valid.
//
//Some examples:
//"3+2*2" = 7
//" 3/2 " = 1
//" 3+5 / 2 " = 5
//Note: Do not use the eval built-in library function.
//
//Credits:
//Special thanks to @ts for adding this problem and creating all test cases.
//
//Hide Tags String
//Hide Similar Problems (M) Basic Calculator (H) Expression Add Operators

public class LeetMBasicCalculatorII227 {
    public static int calculate(String s) {
        int sign = 1; // 1 means +,  -1 means -
        int mulDiv = -1; //-1 means null, 0 means *. 1 means /
        int rst = 0;
        int pre = 0;
        for(int i = 0; i < s.length(); i++) {
        	if(Character.isDigit(s.charAt(i))) {
        		int num = s.charAt(i) - '0';
        		while(++i < s.length() && Character.isDigit(s.charAt(i))) {
        			num = num * 10 + s.charAt(i) - '0';
        		}
        		i--;
        		if(mulDiv == 0) {
        			pre *= num;
        			mulDiv = -1;
        		} else if(mulDiv == 1) {
        			pre /= num;
        			mulDiv = -1;
        		} else {
        			pre = num;
        		}
        	} else if( s.charAt(i) == '+') {
        		rst += sign * pre;
        		sign = 1;
        	} else if(s.charAt(i) == '-') {
        		rst += sign * pre;
        		sign = -1;
        	} else if(s.charAt(i) == '*') {
        		mulDiv = 0;
        	} else if(s.charAt(i) == '/') {
        		mulDiv = 1;
        	}
        }
        
        rst += sign * pre;
        return rst;
        

    }
    
    public static void main(String[] args) {
		int a = calculate(" 34+55 / 26 ");
	}
}
