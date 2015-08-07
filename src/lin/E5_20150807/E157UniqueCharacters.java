package lin.E5_20150807;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Paul on 8/6/15.
 * http://www.lintcode.com/en/problem/unique-characters/
 */
//Unique Characters
//
//        43% Accepted
//        Implement an algorithm to determine if a string has all unique characters.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given "abc", return true.
//
//        Given "aab", return false.
//
//        Challenge
//        What if you can not use additional data structures?
//

public class E157UniqueCharacters {
    /**
     * @param str: a string
     * @return: a boolean
     */
    public static boolean isUnique(String str) {
        // write your code here
        if(str == null || str.length() == 0) {
            return false;
        }
        char[] letters = str.toCharArray();
        ArrayList<Character> mapper = new ArrayList<Character>();
        for(int i = 0; i< letters.length; i++) {
            if(mapper.contains(letters[i])) {
                return false;
            }else{
                mapper.add(letters[i]);
            }
        }
        return true;
    }

    public static void main(String [] args) {
        String a = "abbc";
        boolean b = isUnique(a);
    }

}
