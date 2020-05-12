class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        if(nums.length == 0){
            return 0;
        }
        while(true){
            if(i==0 ||(i>0 && nums[i]!=nums[i-1])){
                nums[j] = nums[i];
                j++;
            }
            i++;
            if(i==nums.length) break;
        }
        return j;
    }
}