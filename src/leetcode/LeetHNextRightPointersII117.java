package leetcode;

import java.util.LinkedList;
import java.util.Queue;

import lin.E1_20150803.E68BinaryTreePostorderT.TreeNode;

public class LeetHNextRightPointersII117 {
	public static class TreeLinkNode {
		int val;
		TreeLinkNode left, right, next;
		TreeLinkNode(int x) { val = x; }
	}
	
    public static void connect(TreeLinkNode root) {
        if(root == null) {
            return;
        }
        Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            TreeLinkNode node = queue.poll();
            if(node.left != null) {
            	queue.offer(node.left);
            }
            if(node.right != null) {
            	queue.offer(node.right);
            }
            for(int i = 1; i < size; i++) {
               TreeLinkNode nextNode = queue.poll();
               if(node.left != null) {
               	queue.offer(node.left);
               }
               if(node.right != null) {
               	queue.offer(node.right);
               }
               node.next = nextNode;
               node = node.next;
            }
            node.next = null;
        }
    }
    
    public static void main(String[] args) {
    	TreeLinkNode a = new TreeLinkNode(1);
    	TreeLinkNode b = new TreeLinkNode(2);
    	TreeLinkNode c = new TreeLinkNode(3);
    	TreeLinkNode d = new TreeLinkNode(4);
    	TreeLinkNode e = new TreeLinkNode(5);
    	TreeLinkNode f = new TreeLinkNode(6);
    	TreeLinkNode g = new TreeLinkNode(7);
//        e.left = f;
        c.right = e;
        b.left = d;
//        b.right = d;
        a.left = b;
        a.right = c;
        connect(a);
	}
}
