package leetcode.leetcode.to80;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>
 * answer link
 * http://www.cnblogs.com/springfor/p/3889706.html
 */
public class _43MultiplyStrings {
    public static String multiply(String num1, String num2) {
        int[] sum = new int[num1.length() + num2.length()];
        for(int i = num1.length()-1; i >= 0; i--) {
            for(int j = num2.length()-1; j >= 0; j--) {
                int temp = (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
                sum[i+j] += (sum[i+j+1] + temp) / 10;
                sum[i+j+1] = (sum[i+j+1] + temp) % 10;  //和前一行的位置不能改变

            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i : sum) {
            if(i > 0 || sb.length() > 0) {
                sb.append(i);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        String s = multiply("002", "003");
    }
}
