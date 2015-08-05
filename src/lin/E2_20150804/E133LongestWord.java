package lin.E2_20150804;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Paul on 8/3/15.
 * http://www.lintcode.com/en/problem/longest-words/
 */
//Longest Words
//
//        39% Accepted
//        Given a dictionary, find all of the longest words in the dictionary.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given
//
//        {
//        "dog",
//        "google",
//        "facebook",
//        "internationalization",
//        "blabla"
//        }
//        the longest words are(is) ["internationalization"].
//
//        Given
//
//        {
//        "like",
//        "love",
//        "hate",
//        "yes"
//        }
//        the longest words are ["like", "love", "hate"].
//
//        Challenge
//        It's easy to solve it in two passes, can you do it in one pass?
public class E133LongestWord {
    /**
     * @param dictionary: an array of strings
     * @return: an arraylist of strings
     */
    static ArrayList<String>  longestWords(String[] dictionary) {
        // write your code here
        if(dictionary == null) {
            return null;
        }
        int max = 0;
        HashMap<Integer, ArrayList<String>> mapper = new HashMap<Integer, ArrayList<String>>();

        for(int i = 0; i < dictionary.length; i++) {
            String word = dictionary[i];
            if(mapper.containsKey(word.length())) {
                ArrayList<String> list = mapper.get(word.length());
                list.add(word);
                mapper.put(word.length(),list);
            }else {
                if(word.length()> max) {
                    max = word.length();
                }
                ArrayList<String> list = new ArrayList<String>();
                list.add(word);
                mapper.put(word.length(), list);
            }
        }
        return mapper.get(max);

    }

    public static void main(String [] args) {
        String[] a = {"dog","google","facebook","internationalization","blabla"};
        ArrayList<String> list = longestWords(a);

    }
}
