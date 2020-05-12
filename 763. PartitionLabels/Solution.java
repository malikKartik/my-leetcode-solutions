class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> list = new ArrayList<>();
        if(S.length()==0) return null;
        
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<S.length();i++){
            map.put(S.charAt(i),i);
        }
        int start = 0;
        int end = map.get(S.charAt(0));
        
        for(int i = start;i<=end;i++){
            if(i<end && map.get(S.charAt(i))>end){
                end = map.get(S.charAt(i));
            }
            
            if(i==end){
                list.add(end - start + 1);
                start = i+1;
                if(i!=S.length()-1)
                end = map.get(S.charAt(i+1));
            }
        }
        return list;
    }
}