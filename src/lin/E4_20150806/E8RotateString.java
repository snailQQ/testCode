package lin.E4_20150806;

/**
 * Created by Paul on 8/5/15.
 * http://www.lintcode.com/en/problem/rotate-string/
 */
//Rotate String
//
//        22% Accepted
//        Given a string and an offset, rotate string by offset. (rotate from left to right)
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given "abcdefg".
//
//        offset=0 => "abcdefg"
//        offset=1 => "gabcdef"
//        offset=2 => "fgabcde"
//        offset=3 => "efgabcd"
//        Challenge
//        Rotate in-place with O(1) extra memory.
public class E8RotateString {
    /*
    * param A: A string
    * param offset: Rotate string with offset.
            * return: Rotated string.
            */
    public char[] rotateString(char[] str, int offset) {
        // wirte your code here
        if(str == null || str.length == 0) {
            return str;
        }

        int length = str.length;
        int times = offset % length;

        for(int i = 1; i <= times; i++) {
            char first = str[str.length -1];
            for(int j = str.length - 1; j > 0; j--) {
                str[j] = str[j-1];
            }
            str[0] = first;
        }

         return str;
    }
}
