class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode prev = temp;
        ListNode curr = temp.next;
        ListNode next = temp.next.next;
        while(next != null){
            if(curr.val == next.val){
                while(next!=null && curr.val == next.val){
                    next = next.next;
                }
                prev.next = next;
                curr = next;
                if(next!=null)
                next = next.next;
            }else{
                prev = prev.next;
                curr = curr.next;
                next = next.next;
            }            
        }
        return temp.next;
    }
}