package lin.M15_20150820;

/**
 * Created by Paul on 8/19/15.
 * http://www.lintcode.com/en/problem/reorder-list/
 * http://www.programcreek.com/2013/12/in-place-reorder-a-singly-linked-list-in-java/
 * http://www.cnblogs.com/springfor/p/3869333.html
 */
//Reorder List
//
//        23% Accepted
//        Given a singly linked list L: L0→L1→…→Ln-1→Ln,
//        reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
//
//        You must do this in-place without altering the nodes' values.
//
//
//
//        Have you met this question in a real interview? Yes
//        Example
//        For example,
//        Given 1->2->3->4->null, reorder it to 1->4->2->3->null.
public class M99ReorderList {
    /**
     * Definition for ListNode.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int val) {
     *         this.val = val;
     *         this.next = null;
     *     }
     * }
     */
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    /**
     * @param head: The head of linked list.
     * @return: void
     */
    public void reorderList(ListNode head) {
        // write your code here
        if (head == null || head.next == null) {
            return;
        }

        ListNode mid = findMid(head);
        ListNode tail = reverseList(mid.next);
        mid.next = null;

        merge(head, tail);
    }

    private ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = null;
        while(head != null) {
            ListNode tmp = head.next;
            head.next = dummy.next;
            dummy.next = head;
            head = tmp;
        }

        return dummy.next;
    }

    private ListNode findMid(ListNode head) {
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private void merge(ListNode l1, ListNode l2) {
        int index = 0;
        ListNode dummy = new ListNode(0);
        while (l1 != null && l2 != null) {
            if (index % 2 == 0) {
                dummy.next = l1;
                l1 = l1.next;
            } else {
                dummy.next = l2;
                l2 = l2.next;
            }
            dummy = dummy.next;
            index ++;
        }
        if (l1 != null) {
            dummy.next = l1;
        } else {
            dummy.next = l2;
        }
    }
}
