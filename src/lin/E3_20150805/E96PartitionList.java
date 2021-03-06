package lin.E3_20150805;

/**
 * Created by Paul on 8/5/15.
 * http://www.lintcode.com/en/problem/partition-list/
 */
//Partition List
//
//        30% Accepted
//        Given a linked list and a value x,
// partition it such that all nodes less than x come before nodes greater than or equal to x.
//
//        You should preserve the original relative order of the nodes in each of the two partitions.
//
//        For example,
//        Given 1->4->3->2->5->2->null and x = 3,
//        return 1->2->2->4->3->5->null.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Tags Expand
public class E96PartitionList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    /**
     * @param head: The first node of linked list.
     * @param x: an integer
     * @return: a ListNode
     */
    public ListNode partition(ListNode head, int x) {
        // write your code here
        if (head == null) {
            return null;
        }

        ListNode leftDummy = new ListNode(0);
        ListNode rightDummy = new ListNode(0);
        ListNode left = leftDummy, right = rightDummy;
//        1->4->3->2->5->2->null
        while (head != null) {
            if (head.val < x) {
                left.next = head;
                left = head;
            } else {
                right.next = head;
                right = head;
            }
            head = head.next;
        }

        right.next = null;
        left.next = rightDummy.next;
        return leftDummy.next;
    }

}


//if(head == null) {
//        return null;
//        }
//
//        ListNode smallDummy = new ListNode(0);
//        ListNode largeDummy = new ListNode(0);
//        ListNode small = smallDummy;
//        ListNode large = largeDummy;
//
//        while(head != null) {
//        if(head.val < x) {
//        ListNode node = head.next;
//        head.next = null;
//        small.next = head;
//        small = small.next;
//        head = node;
//        // small.next = head;
//        // small = small.next;
//        // head = head.next;
//        } else {
//        ListNode node = head.next;
//        head.next = null;
//        large.next = head;
//        large = large.next;
//        head = node;
//        // large.next = head;
//        // large = large.next;
//        // head = head.next;
//        }
//        }
//
//        large.next = null;
//        small.next = largeDummy.next;
//        return smallDummy.next;