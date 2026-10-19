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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> q = new PriorityQueue<>((a,b) -> (a.val - b.val));
        ListNode a = new ListNode(0);
        ListNode tail = a;
        for(ListNode list : lists){
            if(list!=null) q.offer(list);
        }
        while(!q.isEmpty()){
            ListNode t = q.poll();
            tail.next = t;
            tail = t;
            if(t.next!=null) q.offer(t.next);

        }
        return a.next;
    }
}
