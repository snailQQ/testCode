package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Paul on 9/26/15.
 */
//Isomorphic Strings My Submissions Question Solution
//        Total Accepted: 29215 Total Submissions: 115807 Difficulty: Easy
//        Given two strings s and t, determine if they are isomorphic.
//
//        Two strings are isomorphic if the characters in s can be replaced to get t.
//
//        All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
//
//        For example,
//        Given "egg", "add", return true.
//
//        Given "foo", "bar", return false.
//
//        Given "paper", "title", return true.
//
//        Note:
//        You may assume both s and t have the same length.
//
//        Hide Tags Hash Table

public class LeetE205IsomorphicStrings {
//    public boolean isIsomorphic(String s, String t) {
//        if(s == null && t == null) {
//            return true;
//        }
//        if(s.length() != t.length()) {
//            return false;
//        }
//        HashMap<Character, ArrayList<Integer>> hm = new HashMap<Character, ArrayList<Integer>>();
//        for(int i = 0; i < s.length(); i++) {
//            if(hm.containsKey(s.charAt(i))) {
//                hm.get(s.charAt(i)).add(i);
//            } else {
//                ArrayList<Integer> list = new ArrayList<Integer>();
//                list.add(i);
//                hm.put(s.charAt(i), list);
//            }
//        }
//
//        for(int i = 0; i < hm.size(); i++) {
//            ArrayList<Integer> list = hm.get(i);
//
//        }
//    }
}
