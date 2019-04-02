package leetcode.leetcode.to80;

import leetcode.leetcode.util.ListNode;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>
 * answer link
 */

//Given a linked list, rotate the list to the right by k places, where k is non-negative.
//
//    Example 1:
//
//    Input: 1->2->3->4->5->NULL, k = 2
//    Output: 4->5->1->2->3->NULL
//    Explanation:
//    rotate 1 steps to the right: 5->1->2->3->4->NULL
//    rotate 2 steps to the right: 4->5->1->2->3->NULL
//    Example 2:
//
//    Input: 0->1->2->NULL, k = 4
//    Output: 2->0->1->NULL
//    Explanation:
//    rotate 1 steps to the right: 2->0->1->NULL
//    rotate 2 steps to the right: 1->2->0->NULL
//    rotate 3 steps to the right: 0->1->2->NULL
//    rotate 4 steps to the right: 2->0->1->NULL

public class _61RotateList {

  public ListNode rotateRight(ListNode head, int k) {
    if(head == null || head.next == null) {
      return head;
    }

    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode fast = dummy;
    ListNode slow = dummy;
    int count = 0;
    while(fast.next != null) {
      fast = fast.next;
      count++;
    }

    int n = k % count;
    if(n == 0) {
      return head;
    }
    int m = count - n;

    while( m != 0) {
      slow = slow.next;
      m--;
    }

    fast.next = dummy.next;
    dummy.next = slow.next;
    slow.next = null;
    return dummy.next;

  }
}
