package jiuzhang1.C1;

/**
 * Created by Paul on 8/5/15.
 * http://www.lintcode.com/en/problem/strstr/
 * http://www.jiuzhang.com/solutions/implement-strstr/
 * 讲义上的常见错误
 *
 */
//strStr
//
//        18% Accepted
//        strstr (a.k.a find sub string), is a useful function in string operation. Your task is to implement this function.
//
//        For a given source string and a target string, you should output the first index(from 0) of target string in source string.
//
//        If target does not exist in source, just return -1.
//
//        Have you met this question in a real interview? Yes
//        Example
//        If source = "source" and target = "target", return -1.
//
//        If source = "abcdabcdefg" and target = "bcd", return 1.
//
//        Challenge
//        O(n2) is acceptable. Can you implement an O(n) algorithm? (hint: KMP)
//
//        Clarification
//        Do I need to implement KMP Algorithm in a real interview?
//
//        Not necessary. When you meet this problem in a real interview,
// the interviewer may just want to test your basic implementation ability. But make sure your confirm with the interviewer first.
public class E13strStr {
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public static int strStr(String source, String target) {
        //write your code here
//        if(source == null || target == null) {
//            return -1;
//        }
//        int t = target.length();
//        for(int i = 0; i < source.length() - target.length() + 1; i++) {
//            int j;
//            for(j = 0; j < target.length(); j++) {
//                if(source.charAt(i + j) != target.charAt(j)) {
//                    break;
//                }
//            }
//            if(j == target.length()) {
//                return i;
//            }
//        }
//        return -1;

        if(source == null || target == null) {
            return -1;
        }
        int j;
        for(int i = 0; i < source.length() - target.length() + 1; i++) {   //source.length() - target.length() + 1
            for(j = 0; j < target.length(); j++) {
                if(source.charAt(i + j) != target.charAt(j)) {
                    break;
                }
            }
            if(j == target.length()) {//包括字符串为“”的情况
                return i;
            }
        }
        return -1;


    }

    public static void main(String [] args) {
        String source = "";
        String target = "";
        int value = strStr(source, target);
    }
}
