class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        while(temp != null && temp.val == val){
            head = head.next;
            temp = head;
        }
        if(temp == null || temp.next == null){
            if(temp!=null && temp.val == val)
                return head.next;
            else
                return head;
        }
        while(true){
            if(temp == null) break;
            while(temp.next != null && temp.next.val == val ){
                
                temp.next = temp.next.next;    
            }
            if(temp.val != val) temp = temp.next;
        }
        return head;
    }
}