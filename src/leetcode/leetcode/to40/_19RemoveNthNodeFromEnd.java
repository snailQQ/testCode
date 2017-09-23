package leetcode.leetcode.to40;

/**
 * Created by Paul on 10/29/15.
 * question link
 * <p/>https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * answer link
 */
public class _19RemoveNthNodeFromEnd {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = head;
        for(int i = 0; i < n; i++) {
            if(fast == null) {
                return null;
            }
            fast = fast.next;
        }

        ListNode p = dummy;
        while(fast != null) {
            p = p.next;
            fast = fast.next;
        }
        p.next = p.next.next;
        return dummy.next;
    }
}
