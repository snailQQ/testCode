package leetcode;

public class LeetMOneEditDistance161 {
	public static boolean isOneEditDistance(String s, String t) {
        if(s == null || t == null) {
            return false;
        }
        
        int sLength = s.length();
        int tLength = t.length();
        
        if(Math.abs(sLength - tLength) > 1) {
            return false;
        }

        if(sLength > tLength) {
            String temp = t;
            t = s;
            s = temp;
        }
        
        if(sLength == tLength) {
            int count = 0;
            for(int i = 0; i < sLength; i++) {
                if(s.charAt(i) != t.charAt(i)) {
                    count++;
                }
                if(count > 1) {
                    return false;
                }
            }
            if(count == 1) {
                return true;
            }
        } else {
            int i = 0;
            int j = 0;
            int count = 0;
            while(i < s.length()) {
                if(s.charAt(i) == t.charAt(j)) {
                    i++;
                    j++;
                } else {
                    j++;
                    count++;
                    if(count > 1) {
                        return false;
                    }
                }
            }
            return true;
        }
        
        return false;

    }
	
	public static void main(String[] args) {
		boolean a = isOneEditDistance("cab", "ad");
	}
}
