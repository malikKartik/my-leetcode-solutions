class Solution {
    public List<String> buildArray(int[] target, int n) {
        int len = 0;
        int itr = 0;
        List<String> list = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            if(target[itr] == i){
                list.add("Push");
                itr++;
                len++;
            }else{
                list.add("Push");
                list.add("Pop");
            }
            if(len == target.length) break;
        }
        return list;
    }
}