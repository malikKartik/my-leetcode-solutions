public class Solution {
    public ListNode detectCycle(ListNode head) {
        Map<ListNode,Boolean> map = new HashMap<>();
        ListNode temp = head;
        while(temp != null){
            if(map.containsKey(temp)){
                return temp;
            }
            map.put(temp,true);
            temp = temp.next;
        }
        return temp;
    }
}