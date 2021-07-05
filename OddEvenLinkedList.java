
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode odd = head;
        ListNode p = head.next;
        ListNode even = head.next;
        while(odd.next != null && even.next != null){
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = p;
        return head;
    }
}
