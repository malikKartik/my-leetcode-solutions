class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        // for(int i = 0,j=1;i<nums.length;i++){
        //     if(i==0 ||(i>0 && nums[i]!=nums[i-1])){
        //         if(j==k){
        //             return nums[i];
        //         }
        //         j++;
        //     }
        // }
        return nums[nums.length-k];
    }
}