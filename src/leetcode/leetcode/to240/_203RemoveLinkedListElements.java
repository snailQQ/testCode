package leetcode.leetcode.to240;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>
 * answer link
 */
public class _203RemoveLinkedListElements {
  public static class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
      this.val = val;
      this.next = null;
    }
  }
  public ListNode removeElements(ListNode head, int val) {
    if(head == null) {
      return head;
    }
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode p = dummy;
    while(p.next != null) {
      if(p.next.val == val) {
        p.next = p.next.next;
      } else {
        p = p.next;
      }

    }
    return dummy.next;
  }
}
