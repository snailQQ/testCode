
package lin.E1_20150803;


/**
 * Created by Paul on 8/2/15.
 * http://www.lintcode.com/en/problem/count-and-say/
 */
//Count and Say
//
//        28% Accepted
//        The count-and-say sequence is the sequence of integers beginning as follows:
//
//        1, 11, 21, 1211, 111221, ...
//
//        1 is read off as "one 1" or 11.
//
//        11 is read off as "two 1s" or 21.
//
//        21 is read off as "one 2, then one 1" or 1211.
//
//        Given an integer n, generate the nth sequence.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given n = 5, return "111221".
public class E420CountAndSay {
    /**
     * @param n the nth
     * @return the nth sequence
     */

    public static String countAndSay(int n) {
        // Write your code here
//        String initString = "1";
//        if(n == 1) {
//            return initString;
//        }
//
//        for(int i = 2; i <= n; i++) {
//            String newString = "";
//            char letter = initString.charAt(0);
//            int count = 1;
//            for(int j = 1; j < initString.length(); j++) {
//                if(Integer.valueOf(initString.charAt(j)) == letter) {
//                    count++;
//                }else{
//                    newString += String.valueOf(count) + String.valueOf(letter);
//                    letter = initString.charAt(j);
//                    count = 1;
//                }
//            }
//            newString += String.valueOf(count) + String.valueOf(letter);
//            initString = newString;
//        }
//        return initString;
        if(n == 1) {
            return "1";
        }
        String cs = "1";

        for(int i = 2; i <= n; i++) {
            int count = 1;
            String newStr = "";
            char letter = cs.charAt(0);
            for(int j = 1; j < cs.length(); j++) {
                if(cs.charAt(j) == letter) {
                    count++;
                } else {
                    newStr += String.valueOf(count) + String.valueOf(letter);
                    letter = cs.charAt(j);
                    count = 1;
                }
            }
            newStr += String.valueOf(count) + String.valueOf(letter);
            cs = newStr;
        }

        return cs;
    }

    public static void main(String [] args) {
        String a = countAndSay(4);
    }

//    public String countAndSay(int n) {
//        // Write your code here
//        String aString = "";
//        for(int i = 1; i <= n; i++) {
//            if(i == 1) {
//                aString = "11";
//            }else {
//                for(int j = 0; j < aString.length(); j++) {
//                    if
//                }
//            }
//        }
//    }

}
