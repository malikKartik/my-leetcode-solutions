class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int expectedSum = nums.length*(nums.length + 1)/2;
        for(int i = 0;i<nums.length;i++){
            sum = sum + nums[i];
        }
        return expectedSum - sum;
    }
}