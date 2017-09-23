package leetcode.leetcode.to320;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>
 * answer link
 */
public class _297SerializeAndDeserializeBT {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static String serialize(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        serializeHelper(root,result);
        return result.toString();
    }

    private static void serializeHelper(TreeNode root, ArrayList<Integer> result){
        if (root == null) {
            result.add(null);
            return;
        }
        result.add(root.val);
        serializeHelper(root.left,result);
        serializeHelper(root.right,result);
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        String[] strArray = data.substring(1,data.length()-1).split(", ");
        Deque<String> strList = new LinkedList<String>(Arrays.asList(strArray));
        return deserializeHelper(strList);
    }

    private static TreeNode deserializeHelper(Deque<String> strList){
        if (strList.size() == 0) return null;
        String str = strList.pop();
        if (str.equals("null")) return null;
        TreeNode currentRoot = new TreeNode(Integer.parseInt(str));
        currentRoot.left = deserializeHelper(strList);
        currentRoot.right = deserializeHelper(strList);
        return currentRoot;
    }

    public static void main(String[] args) {
        _297SerializeAndDeserializeBT bst = new _297SerializeAndDeserializeBT();
        TreeNode a = new TreeNode(4);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(1);
        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(5);
        TreeNode g = new TreeNode(7);
        e.left = f;
        e.right = g;
        b.left = c;
        b.right = d;
        a.left = b;
        a.right = e;
        String str = serialize(a);
        TreeNode node = deserialize(str);
    }
}
