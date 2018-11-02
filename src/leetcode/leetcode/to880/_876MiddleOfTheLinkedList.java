package leetcode.leetcode.to880;

//Given a non-empty, singly linked list with head node head, return a middle node of linked list.
//
//    If there are two middle nodes, return the second middle node.
//
//
//
//    Example 1:
//
//    Input: [1,2,3,4,5]
//    Output: Node 3 from this list (Serialization: [3,4,5])
//    The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
//    Note that we returned a ListNode object ans, such that:
//    ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
//    Example 2:
//
//    Input: [1,2,3,4,5,6]
//    Output: Node 4 from this list (Serialization: [4,5,6])
//    Since the list has two middle nodes with values 3 and 4, we return the second one.


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class _876MiddleOfTheLinkedList {

  public static class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
      this.val = val;
      this.next = null;
    }
  }

  public ListNode middleNode(ListNode head) {
    if(head == null) {
      return null;
    }

    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode doubleFast = dummy;
    ListNode singleFast = dummy;

    while(doubleFast != null && doubleFast.next != null) {
      singleFast = singleFast.next;
      doubleFast = doubleFast.next.next;
    }

    if(doubleFast != null) {
      return singleFast;
    }
    return singleFast.next;
  }

  public ListNode middleNode2(ListNode head) {
    if(head == null) {
      return null;
    }

    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode p1 = dummy;
    int count = 0;
    while(p1 != null) {
      count++;
      p1 = p1.next;
    }
    if(count % 2 == 1) {
      count = (count / 2) + 1 ;
    } else {
      count = count / 2;
    }

    ListNode p2 = dummy;
    while(count != 0) {
      count--;
      p2 = p2.next;
    }
    return p2;
  }
}
