
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> h = new HashSet<ListNode>();
        ListNode p = headA;
        while(p!=null){
            h.add(p);
            p = p.next;
        }
        p = headB;
        while(p!=null){
            if(h.contains(p))
                return p;
            p = p.next;
        }
        return null;
    }
}
