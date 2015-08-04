//package lin;
//
///**
// * Created by Paul on 7/29/15.
// */
//
////Nth to Last Node in List
////
////        43% Accepted
////        Find the nth to last element of a singly linked list.
////
////        The minimum number of nodes in list is n.
////
////        Have you met this question in a real interview? Yes
////        Example
////        Given a List  3->2->1->5->null and n = 2, return node  whose value is 1.
//
///**
// * Definition for ListNode.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode(int val) {
// *         this.val = val;
// *         this.next = null;
// *     }
// * }
// */
//public class E166NToLastNode {
//
//    public static class ListNode {
//        int val;
//        ListNode next;
//        ListNode(int x) {
//            val = x;
//            next = null;
//        }
//    }
//    /**
//     * @param head: The first node of linked list.
//     * @param n: An integer.
//     * @return: Nth to last node of a singly linked list.
//     */
//    public static ListNode nthToLast(ListNode head, int n) {
//        // write your code here
//        if(head == null) {
//            return null;
//        }
//
//        int size = 0;
//        ListNode ln = head;
//        while(ln != null) {
//            size++;
//            ln = ln.next;
//        }
//
//        int position = size - n;
//        if( position < 0) {
//            return null;
//        } else {
//            while(head != null) {
//                if(position == 0) {
//                    return head;
//                } else {
//                    head = head.next;
//                    position--;
//                }
//            }
//        }
//        return null;
//    }
//
//    public static void main(String [] args) {
//        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(9);
//        l2.next.next = new ListNode(2);
//
//        ListNode l3 = nthToLast(l2, 2);
//    }
//}
