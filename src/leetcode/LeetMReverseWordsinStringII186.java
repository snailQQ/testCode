package leetcode;

/**
 * Created by Paul on 10/5/15.
 */
public class LeetMReverseWordsinStringII186 {
    public static void reverseWords(char[] s) {
        if(s == null || s.length <= 1) {
            return;
        }
        int left = 0;
        int right = s.length-1;
        swap(s, left, right);
        left = 0;
        boolean flag = false;
        for(int j = 0; j < s.length; j++) {
            if(s[j] == ' ') {
                flag = true;
                if((j-left) > 1) {
                    swap(s, left, j-1);
                }
                left = j+1;
            }

        }
        if(!flag) {
            swap(s, 0, s.length-1);
        } else {
            if((s.length-left) > 1) {
                swap(s, left, s.length-1);
            }

        }

    }

    private static void swap(char[] s, int left, int right) {
        while(left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        reverseWords(new char[]{'h', 'i', '!'});
    }
}
