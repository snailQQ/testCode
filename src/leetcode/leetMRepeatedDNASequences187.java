package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetMRepeatedDNASequences187 {
	public static List<String> findRepeatedDnaSequences(String s) {
        List<String> list = new ArrayList<String>();
        if(s == null || s.length() <= 10) {
            return list;
        }
        List<String> list1 = new ArrayList<String>();

        for(int i = 0; i < s.length() - 9; i++) {
            String substr = s.substring(i, i+10);
            if(list1.contains(substr)) {
                list.add(substr);
            } else {
                list1.add(substr);
            }
        }
        return list;
    }
	
	public static void main(String[] args) {
		List<String> list1 = findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
	}
}
