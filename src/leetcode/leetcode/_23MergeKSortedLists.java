package leetcode.leetcode;

/**
 * Created by Paul on 10/30/15.
 * question link
 * <p/>https://leetcode.com/problems/merge-k-sorted-lists/
 * answer link
 * http://www.cnblogs.com/springfor/p/3869217.html
 */
public class _23MergeKSortedLists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) {
            return null;
        }
        return mergeSort(lists, 0, lists.length-1);
    }

    private ListNode mergeSort(ListNode[] lists, int start, int end) {
        if(start < end) {
            int mid = start + (end - start) / 2;
            ListNode leftNode = mergeSort(lists, start, mid);
            ListNode rightNode = mergeSort(lists, mid+1, end);
            return sortLists(leftNode, rightNode);
        }
        return lists[start];
    }

    private ListNode sortLists(ListNode l1, ListNode l2) {
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
                l1 = l1.next;
                head = head.next;
            } else {
                head.next = l2;
                l2 = l2.next;
                head = head.next;
            }
        }

        if(l1 != null) {
            head.next = l1;
        }
        if(l2 != null) {
            head.next = l2;
        }
        return dummy.next;
    }
}
