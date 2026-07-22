/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode dummy = new ListNode(0);    // throwaway starting point
    ListNode tail = dummy;               // 'tail' always points to the last node we've placed

    while (list1 != null && list2 != null) {
        if (list1.val <= list2.val) {
            tail.next = list1;           // attach the smaller node
            list1 = list1.next;          // advance that list
        } else {
            tail.next = list2;
            list2 = list2.next;
        }
        tail = tail.next;                // move our tail pointer forward
    }

    // one list is exhausted — attach whatever remains of the other
    tail.next = (list1 != null) ? list1 : list2;

    return dummy.next;                   // skip the dummy, return the real head
}
    }