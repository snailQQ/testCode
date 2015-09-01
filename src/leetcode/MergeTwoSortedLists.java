package leetcode;

/**
 * Created by Paul on 8/31/15.
 * 21	Merge Two Sorted Lists	32.5%	Easy
 */
public class MergeTwoSortedLists {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if(l1 == null && l2 == null) {
                return null;
            }

            if(l1 == null && l2 != null) {
                return l2;
            }

            if(l1 != null && l2 == null) {
                return l1;
            }

            ListNode returnNode = new ListNode(0);
            ListNode dummy = returnNode;

            while(l1 != null && l2 != null) {
                if(l1.val <= l2.val) {
                    dummy.next = l1;
                    dummy = dummy.next;
                    l1 = l1.next;
                } else {
                    dummy.next = l2;
                    dummy = dummy.next;
                    l2 = l2.next;
                }
            }

            if(l1 != null) {
                dummy.next = l1;
                dummy = dummy.next;
                l1 = l1.next;
            }

            if(l2 != null) {
                dummy.next = l2;
                dummy = dummy.next;
                l2 = l2.next;
            }

            return returnNode.next;
        }
}
