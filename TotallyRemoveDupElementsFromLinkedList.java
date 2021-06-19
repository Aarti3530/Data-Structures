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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return head;
        ListNode p = head;
        HashMap<Integer,Integer> h = new LinkedHashMap<Integer,Integer>();
        ListNode node = new ListNode();
        ListNode N = node;
        while(p != null){
            if(h.containsKey(p.val))
                h.put(p.val,h.get(p.val)+1);
            else
                h.put(p.val,1);
            p = p.next;
        }
       for(Map.Entry<Integer,Integer> entry : h.entrySet()){
           if(entry.getValue() == 1){
               N.next = new ListNode(entry.getKey());
               N = N.next;
           }
       }
        
        return node.next;
    }
}
