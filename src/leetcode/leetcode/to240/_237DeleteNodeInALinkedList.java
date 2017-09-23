package leetcode.leetcode.to240;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>
 * answer link
 */
public class _237DeleteNodeInALinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
//    public void deleteNode(ListNode node) {
//        while(node.next.next != null) {
//            node.val = node.next.val;
//            node = node.next;
//        }
//        node.val = node.next.val;
//        node.next = null;
//    }
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
