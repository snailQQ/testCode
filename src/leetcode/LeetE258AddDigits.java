package leetcode;

/**
 * Created by Paul on 9/22/15.
 * https://leetcode.com/problems/add-digits/
 * http://bookshadow.com/weblog/2015/08/16/leetcode-add-digits/
 */

//Add Digits My Submissions Question Solution
//        Total Accepted: 22153 Total Submissions: 48485 Difficulty: Easy
//        Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
//
//        For example:
//
//        Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
//
//        Follow up:
//        Could you do it without any loop/recursion in O(1) runtime?
//
//        Hint:
//
//        A naive implementation of the above process is trivial. Could you come up with other methods? Show More Hint
//        Credits:
//        Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.
//public class E258AddDigits {
//    public int addDigits(int num) {
//        while(num > 9) {
//            int a = num % 10;
//            int b = num / 10;
//            num = a + b;
//        }
//        return num;
//    }
//}

//solution 2
//    除了0以外任何数字各位加起来都在1到9之间循环
public class LeetE258AddDigits {
    public int addDigits(int num) {
        if(num == 0) {
            return 0;
        }
        num = num % 9;
        if(num == 0) {
            num = 9;
        }
        return num;
    }
}

//solution 3
//class Solution:
//        # @param {integer} num
//        # @return {integer}
//        def addDigits(self, num):
//        if num == 0:
//        return 0
//        return (num - 1) % 9 + 1