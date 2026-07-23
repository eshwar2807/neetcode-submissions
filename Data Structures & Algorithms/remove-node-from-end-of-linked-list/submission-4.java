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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        
        ListNode fast = head;
        int count = 0;
        while(fast != null){
            fast = fast.next;
            ++count;
        }
        if (count == n){
            return head.next;
        }

        fast = head;
        int itr = 0;
        ListNode p = fast;
        while(itr != count-n){
            p = fast;
            fast = fast.next;
            ++itr;

        }
        ListNode t = fast.next;
        p.next = t;
        return head;
    }
}
