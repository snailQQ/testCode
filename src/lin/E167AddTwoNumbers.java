//package lin;
//
///**
// * Created by Paul on 7/28/15.
// */
////Add Two Numbers
////
////        22% Accepted
////        You have two numbers represented by a linked list, where each node contains a single digit.
//// The digits are stored in reverse order, such that the 1's digit is at the head of the list.
//// Write a function that adds the two numbers and returns the sum as a linked list.
////
////        Have you met this question in a real interview? Yes
////        Example
////        Given 7->1->6 + 5->9->2. That is, 617 + 295.
////
////        Return 2->1->9. That is 912.
////
////        Given 3->1->5 and 5->9->2, return 8->0->8.
//
///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode(int x) {
// *         val = x;
// *         next = null;
// *     }
// * }
// */
//public class E167AddTwoNumbers {
//
//      public static class ListNode {
//          int val;
//          ListNode next;
//          ListNode(int x) {
//              val = x;
//              next = null;
//          }
//      }
//
//    /**
//     * @param l1: the first list
//     * @param l2: the second list
//     * @return: the sum list of l1 and l2
//     */
//    public static ListNode addLists(ListNode l1, ListNode l2) {
//        // write your code here
//        if(null == l1 && null == l2) {
//            return null;
//        }
//
//        int carry = 0;
//        ListNode sumNode = new ListNode(0);
//        ListNode point = sumNode;
//
//        while(null != l1 && null != l2) {
//            int value = l1.val + l2.val + carry;
//            carry = value / 10;
//            int nodeValue = value % 10;
//            ListNode aNode = new ListNode(nodeValue);
//            point.next = aNode;
//            l1 = l1.next;
//            l2 = l2.next;
//            point = point.next;
//        }
//
//        while(null != l1) {
//            int value = l1.val + carry;
//            carry = value / 10;
//            int nodeValue = value % 10;
//            ListNode aNode = new ListNode(nodeValue);
//            point.next = aNode;
//            l1 = l1.next;
//            point = point.next;
//        }
//
//        while(null != l2) {
//            int value = l2.val + carry;
//            carry = value / 10;
//            int nodeValue = value % 10;
//            ListNode aNode = new ListNode(nodeValue);
//            point.next = aNode;
//            l2 = l2.next;
//            point = point.next;
//        }
//
//        if(carry != 0) {
//            ListNode aNode = new ListNode(carry);
//            point.next = aNode;
//        }
//
//        return sumNode.next;
//    }
//   // Given 3->1->5 and 5->9->2
//    public static void main(String [] args) {
//        ListNode l1 = new ListNode(3);
//        l1.next = new ListNode(1);
//        l1.next.next = new ListNode(5);
//
//        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(9);
//        l2.next.next = new ListNode(2);
//
//        ListNode l3 = addLists(l1, l2);
//
//
//    }
//
//
////    if(l1 == null && l2 == null) {
////        return null;
////    }
////
////    ListNode head = new ListNode(0);
////    ListNode point = head;
////    int carry = 0;
////    while(l1 != null && l2!=null){
////        int sum = carry + l1.val + l2.val;
////        point.next = new ListNode(sum % 10);
////        carry = sum / 10;
////        l1 = l1.next;
////        l2 = l2.next;
////        point = point.next;
////    }
////
////    while(l1 != null) {
////        int sum =  carry + l1.val;
////        point.next = new ListNode(sum % 10);
////        carry = sum /10;
////        l1 = l1.next;
////        point = point.next;
////    }
////
////    while(l2 != null) {
////        int sum =  carry + l2.val;
////        point.next = new ListNode(sum % 10);
////        carry = sum /10;
////        l2 = l2.next;
////        point = point.next;
////    }
////
////    if (carry != 0) {
////        point.next = new ListNode(carry);
////    }
////    return head.next;
//}
