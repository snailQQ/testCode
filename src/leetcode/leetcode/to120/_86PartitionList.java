package leetcode.leetcode.to120;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>https://leetcode.com/problems/partition-list/
 * answer link
 * http://www.cnblogs.com/springfor/p/3862392.html
 */
public class _86PartitionList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public ListNode partition(ListNode head, int x) {
        if(head == null) {
            return head;
        }
        ListNode dummyLeft = new ListNode(0);
        ListNode dummyRight = new ListNode(0);
        ListNode left = dummyLeft;
        ListNode right = dummyRight;
        while(head != null) {
            if(head.val < x) {
                left.next = head;
                left = left.next;
            } else {
                right.next = head;
                right = right.next;
            }
            head = head.next;
        }
        right.next = null;
        left.next = dummyRight.next;
        return dummyLeft.next;
    }
}
