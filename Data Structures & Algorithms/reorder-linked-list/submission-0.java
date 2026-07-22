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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = slow.next;
        ListNode p = slow.next = null;
        while(second != null){
            ListNode t = second.next;
            second.next = p;
             p = second;
            second = t;
        }
        ListNode first = head;
        second = p;
        while(second != null){
            ListNode fn = first.next;
            ListNode sn = second.next;
            first.next = second;
            second.next = fn;
            first = fn;
            second = sn;

        }

    }
}