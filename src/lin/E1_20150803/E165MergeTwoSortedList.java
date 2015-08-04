//package lin;
//
///**
// * Created by Paul on 7/29/15.
// */
////Merge Two Sorted Lists
////
////        39% Accepted
////        Merge two sorted (ascending) linked lists and return it as a new sorted list.
////        The new sorted list should be made by splicing together the nodes of the two lists and sorted in ascending order.
////
////        Have you met this question in a real interview? Yes
////        Example
////        Given 1->3->8->11->15->null, 2->null , return 1->2->3->8->11->15->null.
//public class E165MergeTwoSortedList {
//        public static class ListNode {
//                int val;
//                ListNode next;
//                ListNode(int x) {
//                        val = x;
//                        next = null;
//                }
//        }
////        /**
////         * @param ListNode l1 is the head of the linked list
////         * @param ListNode l2 is the head of the linked list
////         * @return: ListNode head of linked list
////         */
//        public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        // write your code here
//                if(l1 == null && l2 == null) {
//                        return null;
//                }
//
//                ListNode returnList = new ListNode(0);
//                ListNode position = returnList;
//                while(l1 != null && l2 != null) {
//                        if(l1.val <= l2.val) {
//                                position.next = l1;
//                                l1 = l1.next;
//                                position = position.next;
//                        }else{
//                                position.next = l2;
//                                l2 = l2.next;
//                                position = position.next;
//                        }
//                }
//
//                while(l1 != null) {
//                        position.next = l1;
//                        break;
//                }
//
//                while(l2 != null) {
//                        position.next = l2;
//                        break;
//                }
//                return returnList.next;
//        }
//
//        public  static  void main(String [] args) {
////               1->3->8->11->15->null
//                ListNode l1 = new ListNode(1);
//                l1.next = new ListNode(3);
//                l1.next.next = new ListNode(8);
//                l1.next.next.next = new ListNode(11);
//                l1.next.next.next.next = new ListNode(15);
//
//                ListNode l2 = new ListNode(2);
//
//                ListNode l3 = mergeTwoLists(l1, l2);
//        }
//}
