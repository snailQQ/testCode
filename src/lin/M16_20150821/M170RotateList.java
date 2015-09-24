package lin.M16_20150821;

/**
 * Created by Paul on 8/19/15.
 * http://www.lintcode.com/en/problem/rotate-list/
 */
//Rotate List
//
//        27% Accepted
//        Given a list, rotate the list to the right by k places, where k is non-negative.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given 1->2->3->4->5 and k = 2, return 4->5->1->2->3.
//
//        Tags Expand

public class M170RotateList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
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
     * @param head: the List
     * @param k: rotate to the right k places
     * @return: the list after rotation
     */
    public static ListNode rotateRight(ListNode head, int k) {
        // write your code here
        if(head == null) {
            return head;
        }

        ListNode length = head;
        int count = 0;
        while(length != null) {
            length = length.next;
            count++;
        }

        int steps = k % count;
        if(steps == 0) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode front = dummy;
        ListNode back = dummy;
        for(int i = 0; i < steps; i++) {
            front = front.next;
        }

        while(front.next != null) {
            front = front.next;
            back = back.next;
        }

        ListNode temp = dummy.next;
        dummy.next = back.next;
        back.next = null;
        front.next = temp;

        return dummy.next;
    }

    public static void main(String [] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        ListNode f = rotateRight(l1, 1);

    }
}
