package leetcode;

/**
 * Created by Paul on 9/29/15.
 */
public class LeetE168ExcelSheetColumnTitle {
    public static String convertToTitle(int n) {
        if(n < 1) {
            return "";
        }

        String str = "";

        while(n > 26) {
            int a = n % 26;
            n = n / 26;
            if(a == 0) {
                str = String.valueOf((char)('A'+25)) + str;
                n = n-1;
            } else {
                str = String.valueOf((char)('A'+a-1)) + str;
            }

        }

        str = String.valueOf((char)('A'+n-1)) + str;
        return str;
    }

    public static void main(String[] args) {
        String str = convertToTitle(52);
    }
}
