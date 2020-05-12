class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;
        int len = 0;
        ListNode temp = head;
        while(temp.next != null){
            len++;
            temp = temp.next;
        }
        len++;
        int rot = k%len;
        System.out.println(rot);
        temp.next = head;
        
        for(int i = 0;i<len-rot;i++){
            temp = temp.next;
            head = head.next;
        }
        temp.next = null;
        return head;
    }
}