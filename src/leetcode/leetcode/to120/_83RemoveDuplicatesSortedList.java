package leetcode.leetcode.to120;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>
 * answer link
 */

public class _83RemoveDuplicatesSortedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode dummy = head;
        while(head.next != null) {
            if( head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }

        }

        return dummy;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(1);
        a.next = b;
        b.next = c;
        ListNode node = deleteDuplicates(a);
    }
}
