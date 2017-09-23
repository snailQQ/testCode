package leetcode.leetcode.to200;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>
 * answer link
 */
public class _168ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        String str = "";
        while(n != 0) {
            int number = n % 26;
            n = n/26;
            if(number == 0) {
                str = String.valueOf((char)('A'+25)) + str;
                n = n-1;
            } else {
                str = String.valueOf((char)('A'+number-1)) + str;
            }
        }
        return str;
    }
}
