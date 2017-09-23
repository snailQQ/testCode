package leetcode.leetcode.to40;

/**
 * Created by Paul on 10/28/15.
 * question link https://leetcode.com/problems/palindrome-number/description/
 *
 * Determine whether an integer is a palindrome. Do this without extra space.

 click to show spoilers.

 Some hints:
 Could negative integers be palindromes? (ie, -1)

 If you are thinking of converting the integer to string, note the restriction of using extra space.

 You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?

 There is a more generic way of solving this problem.


 * <p/>https://leetcode.com/submissions/detail/41047552/
 * answer link
 */
public class _9PalindromeNumber {
    public static boolean isPalindrome(int x) {
//        if(x < 0) {
//            return false;
//        }
//
//        int div = 1;
//        while(x / div >= 10) {
//            div *= 10;
//        }
//
//        while(x != 0) {
//            int left = x / div;
//            int right = x % 10;
//            if(left != right) {
//                return false;
//            }
//            x = (x % div) / 10;
//            div /= 100;
//        }
//
//        return true;
        if(x < 0) {
            return false;
        }

        long reverseNum = 0;
        int y = x;
        while(y != 0) {
            reverseNum = reverseNum * 10 + y % 10;
            y = y / 10;
        }

        while(x != 0) {
            if( x % 10 != reverseNum % 10) {
                return false;
            }
            x = x / 10;
            reverseNum = reverseNum / 10;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(0));
    }
}
