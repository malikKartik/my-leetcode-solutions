class Solution {
    public int wiggleMaxLength(int[] nums) {
    if(nums.length<2){
        return nums.length;
    }    
    int count=1;
    for(int i=1; i<nums.length; i++){
        if(nums[i-1]<nums[i]){
            count++;
            while(i<nums.length-1 && nums[i]<=nums[i+1]){
                i++;
            }
        }else if(nums[i-1]>nums[i]){
            count++;
            while(i<nums.length-1 && nums[i]>=nums[i+1]){
                i++;
            }
        }
    }
    return count;
    }
}
