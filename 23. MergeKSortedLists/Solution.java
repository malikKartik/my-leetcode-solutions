/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public static ListNode mergeLists(ListNode l1,ListNode l2){
        ListNode sol = new ListNode(0);
        ListNode head = sol;
        while(true){
            if(l1==null){
                head.next = l2;
                break;
            }
            if(l2==null){
                head.next = l1;
                break;
            }
            if(l1.val<=l2.val){
                head.next = l1;
                l1 = l1.next;
            }else{
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }
        return sol.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode sol = new ListNode(0);
        ListNode head = sol;
        if(lists.length==0){
            return sol.next;
        }
        ListNode l1 = lists[0];
        
        for(int i = 1;i<lists.length;i++){
            l1 = mergeLists(l1,lists[i]);
        }
        return l1;
    }
}