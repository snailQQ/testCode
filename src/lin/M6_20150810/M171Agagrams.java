package lin.M6_20150810;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Paul on 8/9/15.
 * http://www.lintcode.com/en/problem/anagrams/
 * http://www.cnblogs.com/springfor/p/3874667.html
 */
//Anagrams
//
//        22% Accepted
//        Given an array of strings, return all groups of strings that are anagrams.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given ["lint", "intl", "inlt", "code"], return ["lint", "inlt", "intl"].
//
//        Given ["ab", "ba", "cd", "dc", "e"], return ["ab", "ba", "cd", "dc"].
//
//        Note
//        All inputs will be in lower-case


public class M171Agagrams {
    /**
     * @param strs: A list of strings
     * @return: A list of strings
     */
    public static List<String> anagrams(String[] strs) {
        // write your code here
        List<String> rst = new ArrayList<String>();
        if(strs == null || strs.length == 0) {
            return rst;
        }

        if(strs.length == 1) {
            rst.add(strs[0]);
            return rst;
        }

        HashMap<String, ArrayList<String>> hm = new HashMap<String,ArrayList<String>>();
        for(String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String tempStr=new String(charArray);
            if(hm.containsKey(tempStr)) {
                if(hm.get(tempStr).size() == 1) {
                    rst.add(hm.get(tempStr).get(0));
                }
                    hm.get(tempStr).add(str);
                    rst.add(str);

            } else {
                ArrayList<String> list = new ArrayList<String>();
                list.add(str);
                hm.put(tempStr, list);
            }
        }

        return rst;
    }

    public static void main(String[] args) {
        String[] a = {"",""};
        List<String> b = anagrams(a);
    }
}
