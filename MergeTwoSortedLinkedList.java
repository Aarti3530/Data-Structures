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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode res = new ListNode();
        ListNode p = res;
        while(p1 != null && p2 != null){
            if(p1.val <= p2.val){
                //p.val = p1.val;
                p.next = new ListNode(p1.val);
                p = p.next;
                p1 = p1.next;
            }
            else if(p2.val <= p1.val){
                //p.val = p2.val;
                p.next = new ListNode(p2.val);
                p = p.next;
                p2 = p2.next;
            }
        }
        if(p1 != null){
            while(p1 != null){
                //p.val = p1.val;
                p.next = new ListNode(p1.val);
                p = p.next;
                p1 = p1.next;
            }
        }
        else if(p2 != null){
            while(p2 != null){
                //p.val = p2.val;
                p.next = new ListNode(p2.val);
                p = p.next;
                p2 = p2.next;
            }
        }
        
        return res.next;
    }
}
