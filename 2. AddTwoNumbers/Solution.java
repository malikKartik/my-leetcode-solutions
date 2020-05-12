class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode p=l1,q=l2,curr = temp;
        int carry = 0;
        while(p != null || q!=null){
            int x = (p != null)? p.val : 0;
            int y = (q!=null)? q.val: 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            p = (p!=null)? p.next:null;
            q = (q!=null)? q.next:null;
        }
        if(carry>0){
            curr.next = new ListNode(carry);
        }
        return temp.next;
            
    }
}