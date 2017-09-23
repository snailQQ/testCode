package leetcode.leetcode.to80;

import java.util.LinkedList;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>
 * answer link
 */
public class _71SimplifyPath {
    public static String simplifyPath(String path) {
        if(path.length() == 0){
            return path;
        }

        String[] splits = path.split("/");
        LinkedList<String> stack = new LinkedList<String>();
        for (String s : splits) {
            if(s.length()==0 || s.equals(".")){
                continue;
            }else if(s.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(s);
            }
        }

        if(stack.isEmpty()){
            stack.push("");
        }
        String ret = "";
        while(!stack.isEmpty()){
            ret += "/" + stack.removeLast();
        }

        return ret;
    }

    public static void main(String[] args) {
        String s = simplifyPath("/a/./b/../../c/");
    }
}
