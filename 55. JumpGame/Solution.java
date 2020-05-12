class Solution {
    public boolean canJump(int[] nums) {
        int last = nums.length - 1;
        for(int i = nums.length-1;i>=0;i--){
            if(i + nums[i]>=last){
                last = i;
            }
        }
        if(last == 0){
            return true;
        }
        return false;
    }
}