public class Solution {
    public boolean hasCycle(ListNode head) {
        Map<ListNode,Boolean> map = new HashMap<>();
        ListNode temp = head;
        while(temp != null){
            if(map.containsKey(temp)){
                return true;
            }
            map.put(temp,true);
            temp = temp.next;
        }
        return false;
    }
}