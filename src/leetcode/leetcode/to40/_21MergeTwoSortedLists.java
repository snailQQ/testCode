package leetcode.leetcode.to40;

/**
 * Created by Paul on 10/29/15.
 * question link
 * <p/>
 * answer link
 */
public class _21MergeTwoSortedLists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) {
            return l1;
        }
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                head.next = l1;
                head = head.next;
                l1 = l1.next;
            } else {
                head.next = l2;
                head = head.next;
                l2 = l2.next;
            }
        }

        while(l1 != null) {
            head.next = l1;
            head = head.next;
            l1 = l1.next;
        }

        while(l2 != null) {
            head.next = l2;
            head = head.next;
            l2 = l2.next;
        }
        return dummy.next;
    }

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) {
            return null;
        }

        if(l1 == null) {
            return l2;
        }

        if(l2 == null) {
            return l1;
        }

        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        while(l1 != null & l2 != null) {
            int value = 0;
            if(l1.val <= l2.val) {
                value = l1.val;
                l1 = l1.next;
            } else {
                value = l2.val;
                l2 = l2.next;
            }
            ListNode newNode = new ListNode(value);
            p.next = newNode;
            p = p.next;

        }

        if(l1 != null) {
            p.next = l1;
        }

        if(l2 != null) {
            p.next = l2;
        }
        return dummy.next;
    }
}
