package lin.M16_20150821;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by Paul on 8/19/15.
 * http://www.cnblogs.com/springfor/p/3869666.html
 */
//Simplify Path
//
//        22% Accepted
//        Given an absolute path for a file (Unix-style), simplify it.
//
//        Have you met this question in a real interview? Yes
//        Example
//        "/home/", => "/home"
//
//        "/a/./b/../../c/", => "/c"
//
//        Challenge
//        Did you consider the case where path = "/../"?
//
//        In this case, you should return "/".
//
//        Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
//
//        In this case, you should ignore redundant slashes and return "/home/foo".
public class M421SimplifyPath {
    /**
     * @param path the original path
     * @return the simplified path
     */
    public String simplifyPath(String path) {
        // Write your code here
        if(path == null || path.length() == 0) {
            return path;
        }

        Stack<String> stack = new Stack<String>();
        String[] array = path.split("/");
        for(int i = 0; i < array.length; i++) {
            if(array[i].equals(".") || array[i].length() == 0) {
                continue;
            } else if(array[i].equals("..")) {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(array[i]);
            }
        }

        StringBuilder sb = new StringBuilder();
        Stack<String> newStack = new Stack<>();
        while(!stack.isEmpty()) {
            newStack.push(stack.pop());
        }

        while(!newStack.isEmpty()) {
            sb.append("/"+newStack.pop());
        }

        if(sb.length()==0) {
            sb.append("/");
        }

        return sb.toString();



    }
}
