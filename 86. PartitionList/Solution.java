class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode prev = temp;
        ListNode curr = temp.next;
        ListNode sol = new ListNode(0);
        ListNode itr = sol;
        while(curr != null){
            if(curr.val < x){
                itr.next = curr;
                itr = itr.next;
                prev.next = curr.next;
                curr = curr.next;
                itr.next = null;
            }else{
                prev = prev.next;
                curr = curr.next;
            }
            
        }
        itr.next = temp.next;
        return sol.next;
    }
}