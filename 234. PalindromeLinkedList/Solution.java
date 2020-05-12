class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        Stack<Integer> stack = new Stack<Integer>(); 
        while(temp!=null){
            stack.push(temp.val);
            temp = temp.next;
        }
        while(head != null){
            int x = stack.pop();
            if(head.val!=x){
                return false;
            }
            head = head.next;
        }
        return true;
    }
}