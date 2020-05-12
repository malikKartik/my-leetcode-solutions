class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k>=nums.length){
            int max = nums[0];
            for(int j = 0;j<nums.length;j++){
                if(max<nums[j]){
                    max = nums[j];
                }
            }
            int maxarr[] = {max};
            return maxarr;
        }
        int arr[] = new int[nums.length-k+1];
        for(int i = 0;i<nums.length-k+1;i++){
            int max = nums[i];
            for(int j = i;j<i+k;j++){
                if(max<nums[j]){
                    max = nums[j];
                }
            }
            arr[i] = max;
        }
        return arr;
    }
}