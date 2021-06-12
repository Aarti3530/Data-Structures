class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n == 1 && head.next == null)
            return null;
        else if(n == 1){
            ListNode s = head;
            while(s.next.next != null){
                s = s.next;
            }
            s.next = null;
            return head;
        }
        int c = 0;
        ListNode p = head;
        while(p!=null){
            p = p.next;
            c++;
        }
        if(n == c)
            return head.next;
        int size = c - n;
        
        c = 1;
        p = head;
        while(c < size){
           p = p.next;
            c++;
        }
        p.next = p.next.next;
        return head;
    }
}
