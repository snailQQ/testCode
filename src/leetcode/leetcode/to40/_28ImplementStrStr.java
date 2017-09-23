package leetcode.leetcode.to40;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>
 * answer link
 */
public class _28ImplementStrStr {
    public static int strStr(String haystack, String needle) {
        if(haystack == null || needle == null || needle.length() > haystack.length()) {
            return -1;
        }

        for(int i = 0; i < haystack.length() - needle.length() + 1; i++) { //haystack只需要检查到
            //haystack.length() - needle.length() 位置, 不然可能下面代码的haystack.charAt(i+j) 字符串会
            // 越界
            int j;
            for(j = 0; j < needle.length(); j++) {
                if(haystack.charAt(i+j) != needle.charAt(j)) {
                    break; //如果没有符合的情况,就跳出
                }
            }
            if(j == needle.length()) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int i = strStr("mississippi", "a");
        System.out.println("result: " + i);
    }
}
