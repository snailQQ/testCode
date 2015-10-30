package leetcode.leetcode;

/**
 * Created by Paul on 10/30/15.
 * question link
 * <p/>https://leetcode.com/problems/swap-nodes-in-pairs/
 * answer link
 * http://www.cnblogs.com/springfor/p/3862030.html
 */
public class _24SwapNodesInPairs {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = head;
        ListNode slow = dummy;
        while(fast != null && fast.next != null) {
            ListNode temp = fast.next.next;
            fast.next.next = fast;
            slow.next = fast.next;
            fast.next = temp;
            slow = fast;
            fast = fast.next;
        }
        return dummy.next;
    }
}
