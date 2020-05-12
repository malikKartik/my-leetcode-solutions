class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        List<ListNode> list = new ArrayList<>();
        ListNode temp = head;
        int itr = 1;
        while(temp != null){
            if(itr>=m && itr<=n){
                list.add(temp);
            }
            temp = temp.next;
            itr++;
        }
        for(int i = 0;i<list.size()/2;i++){
            int tempVal = list.get(list.size()-i-1).val;
            list.get(list.size()-i-1).val = list.get(i).val;
            list.get(i).val = tempVal;
        }
        return head;
    }
}