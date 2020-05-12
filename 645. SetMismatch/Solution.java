class Solution {
    public int[] findErrorNums(int[] nums) {
        int expectedSum = nums.length*(nums.length+1)/2;
        Set<Integer> set = new HashSet<>();
        int dup = 0;
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            if(set.contains(nums[i])){
                dup = nums[i];
            }
            set.add(nums[i]);
            sum = sum + nums[i];
        }
        int[] sol = new int[2];
        sol[0] = dup;
        sol[1] = dup + (expectedSum - sum);
        return sol;
    }
}