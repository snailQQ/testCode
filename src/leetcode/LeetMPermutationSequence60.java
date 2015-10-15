package leetcode;

import java.util.ArrayList;

//https://leetcode.com/problems/permutation-sequence/
//	
//	https://leetcode.com/discuss/42700/explain-like-im-five-java-solution-in-o-n	
public class LeetMPermutationSequence60 {
	public String getPermutation(int n, int k) {
		ArrayList<Integer> list = new ArrayList<Integer>(); // store the numbers
		int[] factorial = new int[n+1];
		factorial[0] = 1;
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i<= n; i++) {
			factorial[i] = factorial[i-1] * i;
			list.add(i);
		}
		
		k--; // start from 0
		
		for(int i = 1; i <= n; i++) {
			int index = k / factorial[n-i];
			sb.append(list.get(index));
			list.remove(index);
			k -= index * factorial[n-i];
		}
		
		return String.valueOf(sb);
	}
}
