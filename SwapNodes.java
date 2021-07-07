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
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
       ListNode p = head;
       while(p.next != null && p.next.next != null){
           int t = p.val;
           p.val = p.next.val;
           p.next.val = t;
           p = p.next.next;
       }
        if(p.next != null){
        int t = p.val;
        p.val = p.next.val;
        p.next.val = t;
        p = p.next.next;
        }
        return head;
    }
}
