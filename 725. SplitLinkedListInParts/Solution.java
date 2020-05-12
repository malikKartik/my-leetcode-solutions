/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] arr = new ListNode[k];
        ListNode temp = root;
        int len = 0;
        while(temp !=null){
            temp = temp.next;
            len++;
        }
        int perDivision = len/k;
        int extra = len%k;
        System.out.println(perDivision);
        System.out.println(extra);
        int itr = 0;
        temp = root;
        for(int i = 0;i<extra;i++){
            ListNode temphead = new ListNode(0);
            ListNode curr = temphead;
            for(int j = 0;j<=perDivision;j++){
                if(temp != null){
                    curr.next = new ListNode(temp.val);
                    curr = curr.next;
                    temp = temp.next;
                }else{
                    curr.next = null;
                    curr = curr.next;
                }
            }
            arr[i] = temphead.next;
        }
        for(int i = extra;i<k;i++){
            ListNode temphead = new ListNode(0);
            ListNode curr = temphead;
            for(int j = 0;j<perDivision;j++){
                if(temp != null){
                    curr.next = new ListNode(temp.val);
                    curr = curr.next;
                    temp = temp.next;
                }else{
                    if(curr!=null){
                        curr.next = null;
                        curr = curr.next;
                    }
                }
            }
            arr[i] = temphead.next;
        }
    return arr;
    }
    
}