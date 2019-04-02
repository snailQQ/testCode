package leetcode.leetcode.to160;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>
 * answer link
 */
public class _160IntersectionOfTwoLinkedLists {

  public static class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
      this.val = val;
      this.next = null;
    }
  }

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if(headA == null || headB == null ) {
      return null;
    }

    ListNode A = headA;
    ListNode B = headB;
    while(A != B) {
      A = A == null ? headB : A.next;
      B = B == null ? headA : B.next;
    }
    return A;
  }
}
