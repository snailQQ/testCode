package leetcode.leetcode.to80;

import java.util.*;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>
 * answer link
 * http://www.cnblogs.com/springfor/p/3896168.html
 */
public class _68TextJustification {
    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> list = new ArrayList<String>();
        if(words == null || words.length == 0) {
            return list;
        }
        int len = 0; //每行字符的长度
        int last = 0; //当前走到的位置
        for(int i = 0; i < words.length; i++) {
            if(len + words[i].length() + (i - last) > maxWidth) {
                int spaceNum = 0;
                int extraNum = 0;
                if( (i - last) - 1 > 0) {
                    spaceNum = (maxWidth - len) / (i - last - 1); //每两个字母之前的空格
                    extraNum = (maxWidth - len) % (i - last - 1); //如果还有余数，每两个字母之间要多分一个，直到分完
                }
                StringBuilder sb = new StringBuilder();
                for(int j = last; j < i; j++) {
                    sb.append(words[j]);
                    if(j < i-1) {
                        for(int k = 0; k < spaceNum; k++) {
                            sb.append(" ");
                        }
                        if(extraNum > 0) {
                            sb.append(" ");
                        }
                        extraNum--;
                    }
                }

                for(int j = sb.length(); j < maxWidth; j++) {
                    sb.append(" ");
                }
                list.add(sb.toString());
                len = 0;
                last = i;
            }
            len += words[i].length();
        }

        StringBuilder sb = new StringBuilder();
        for(int i = last; i < words.length; i++){ //多个单词之间要加空格
            sb.append(words[i]);
            if(sb.length() < maxWidth) {
                sb.append(" ");
            }
        }
        for(int i = sb.length(); i < maxWidth; i++) { //最后一个单词之后要加空格
            sb.append(" ");
        }
        list.add(sb.toString());
        return list;
    }

    public static void main(String[] args) {
        List<String> s = fullJustify(new String[]{"Listen","to","many,","speak","to","a","few."}, 6);
        String[] arr = {"b", "c", "a", "f", "a","z","x","f","l"};
        Arrays.sort(arr);
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
