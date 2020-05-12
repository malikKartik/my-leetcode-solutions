class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0;i<nums.length;i++)
            arr[i] = 1;
        for(int i = 1;i<nums.length;i++){
            for(int j = 0;j<i;j++){
                if(nums[i]>nums[j] && arr[j]<arr[i]+1){
                    arr[i] = Math.max(arr[i],arr[j] + 1);
                }
            }
        }
        int max = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max)
                max = arr[i];
        }
        return max;
    }
}