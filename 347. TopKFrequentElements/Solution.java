class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> code = new ArrayList<Integer>(map.keySet());
        ArrayList<Integer> freq = new ArrayList<Integer>(map.values());
        ArrayList<Integer> freqSorted = new ArrayList<Integer>(map.values());
        Collections.sort(freqSorted);
        Collections.reverse(freqSorted);
        List<Integer> list = new ArrayList<>();
        System.out.println(freq);
        System.out.println(code);
        for(int i = 0;i<k;i++){
            list.add(code.get(freq.indexOf(freqSorted.get(0))));
            
            if(freqSorted.size()==0) break;
            code.remove(freq.indexOf(freqSorted.get(0)));
            freq.remove(freq.indexOf(freqSorted.get(0)));
            
            freqSorted.remove(0);
        }
        return list;
    }
}