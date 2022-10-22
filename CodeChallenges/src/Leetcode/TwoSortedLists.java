package Leetcode;
/**
 * <a href="https://leetcode.com/problems/merge-two-sorted-lists/">...</a>
 * You are given the heads of two sorted linked lists list1 and list2. *
 * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists. *
 * Return the head of the merged linked list.
 *
 *Constraints: *
 * The number of nodes in both lists is in the range [0, 50].
 * -100 <= Node.val <= 100
 * Both list1 and list2 are sorted in non-decreasing order. *
 *
 *
 *
 *
 * Definition for singly-linked list.
 *     public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 *     }
 */

public class TwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //base scenarios when only one list is provided
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        //if current element of list 1 is less than list2 element, do recursive call
        if(list1.val< list2.val){
            //assign a new element on the list, the value will be calculated once recursion is over
            list1.next = mergeTwoLists(list1.next, list2);
            //recursive call might end here, returning head
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            //recursive call might end here, returning head
            return list2;
        }
    }
}
