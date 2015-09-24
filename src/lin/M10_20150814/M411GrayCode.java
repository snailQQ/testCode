package lin.M10_20150814;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul on 8/13/15.
 * http://www.lintcode.com/en/problem/gray-code/
 * http://www.cnblogs.com/yuzhangcmu/p/4121804.html
 * https://zh.wikipedia.org/wiki/格雷码
 * http://blog.csdn.net/nicaishibiantai/article/details/38490141
 */
//Gray Code
//
//        34% Accepted
//        The gray code is a binary numeral system where two successive values differ in only one bit.
//
//        Given a non-negative integer n representing the total number of bits in the code, find the sequence of gray code. A gray code sequence must begin with 0 and with cover all 2n integers.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given n = 2, return [0,1,3,2]. Its gray code sequence is:
//
//        00 - 0
//        01 - 1
//        11 - 3
//        10 - 2
//        Note
//        For a given n, a gray code sequence is not uniquely defined.
//
//        [0,2,3,1] is also a valid gray code sequence according to the above definition.
//
//        Challenge
//        O(2n) time.
public class M411GrayCode {
    /**
     * @param n a number
     * @return Gray code
     */
    public static ArrayList<Integer> grayCode(int n) {
        // Write your code here
        ArrayList<Integer> ret = new ArrayList<Integer>();
        if (n == 0) {
            ret.add(0);
            return ret;
        }

        ret = grayCode(n - 1);

        for (int i = ret.size() - 1; i >= 0; i--) {
            int num = ret.get(i);
            num += 1 << (n - 1);
            ret.add(num);
        }

        return ret;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = grayCode(3);
    }
}
