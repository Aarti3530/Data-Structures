
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null)
            return false;
        ListNode prev = head;
        ListNode n = head;
        while(n != null && prev != null && n.next != null){
            prev = prev.next;
            n = n.next.next;
            if(prev == n)
                return true;
           
        }
        return false;
    }
}
