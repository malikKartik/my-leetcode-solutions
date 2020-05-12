class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        int sol = 0;
        for(int i = 0,j = 0;j<s.length();j++){
            if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)),i);
            }
            sol = Math.max(sol,j-i+1);
            map.put(s.charAt(j),j+1);
        }
        return sol;
        
    }
}