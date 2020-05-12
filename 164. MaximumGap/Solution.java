class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2) return 0;
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        Object[] arr = set.toArray();
        int prev = (int)arr[0];
        int max = 0;
        for(int i = 1;i<arr.length;i++){
            int curr = (int)arr[i];
            max = Math.max(max,curr-prev);
            prev = curr;
        }
        // Iterator it = set.iterator(); 
        // while(it.hasNext() ) {
        //     int curr = (int)it.next();
        //     max = Math.max(max,curr-prev);
        //     prev = curr;
        // }
        return max;
    }
}