class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode prev = head;
        if(head == null || head.next == null) return head;
        ListNode curr = head.next;
        ListNode next = curr.next;
        head = curr;
        
        while(true){
            
            if(next == null ||next.next == null){
                prev.next = next;
                curr.next = prev;
                break;
            }
            prev.next = next;
            curr.next = prev;
            curr = next.next;
            prev.next = curr;
            prev = next;
            next = curr.next;
        }
        return head;
    }
}