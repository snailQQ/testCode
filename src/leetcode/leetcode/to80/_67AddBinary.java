package leetcode.leetcode.to80;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>
 * answer link
 */
public class _67AddBinary {
    public static String addBinary(String a, String b) {
        if(a == null || a.length() == 0) {
            return b;
        }

        if(b == null || b.length() == 0) {
            return a;
        }

        if(a.length() < b.length()) {
            String tmp = a;
            a = b;
            b = tmp;
        }

        int len = a.length() - b.length();
        char carry = '0';
        String str = "";
        for(int i = b.length()-1; i >= 0; i--) {
            char cA = a.charAt(len + i);
            char cB = b.charAt(i);
            if(cA == '1' && cB == '1') {
                str = carry + str;
                carry = '1';
            } else if(cB == '0' && cA == '0') {
                if(carry == '1') {
                    str = "1" + str;
                    carry = '0';
                } else {
                    str = "0" + str;
                }
            } else if((cA == '1' && cB == '0') || (cB == '1' && cA == '0')) {
                if(carry == '0') {
                    str = "1" + str;
                } else {
                    str = "0" + str;
                }
            }
        }


        for(int i = len - 1; i >= 0; i--) {
            char c = a.charAt(i);
            if(c == '1' && carry == '1') {
                str = "0" + str;
            } else if( c == '1' || carry == '1') {
                str = "1" + str;
                carry = '0';
            } else {
                str = "0" + str;
            }
        }
        if(carry == '1') {
            str = "1" + str;
        }
        return str;
    }

    public static void main(String[] args) {
        String s = addBinary("100", "110010");
    }
}
