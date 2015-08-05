package lin.E3_20150805;

/**
 * Created by Paul on 8/5/15.
 * http://www.lintcode.com/en/problem/plus-one/
 */
//Plus One
//
//        29% Accepted
//        Given a non-negative number represented as an array of digits, plus one to the number.
//
//        The digits are stored such that the most significant digit is at the head of the list.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given [1,2,3] which represents 123, return [1,2,4].
//
//        Given [9,9,9] which represents 999, return [1,0,0,0].
//
//        Tags Expand
public class E407PlusOne {
    /**
     * @param digits a number represented as an array of digits
     * @return the result
     */
    public int[] plusOne(int[] digits) {
        // Write your code here
        if(digits == null) {
            return null;
        }
        int carry = (digits[digits.length-1] + 1) / 10;
        digits[digits.length-1] = (digits[digits.length-1] + 1) % 10;

        for(int i = digits.length - 2; i > 0; i--){
            int number = (digits[i] + carry) % 10;
            carry = (digits[i] + 1) / 10;
            digits[i] = number;
        }

        if(carry == 0) {
            return digits;
        }else if(digits[0] == 9){
            int[] newDigits = new int[digits.length+1];
            newDigits[0] = 1;
            newDigits[1] = 0;
            for(int i = 1; i < digits.length; i++) {
                newDigits[i+1] = digits[i];
            }
            return newDigits;
        }else {
            digits[0] = digits[0] + 1;
            return digits;
        }
    }

}
