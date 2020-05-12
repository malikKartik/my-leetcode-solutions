class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum = sum + nums[i];
        }
        List<Integer> temp = new ArrayList<>();
        int i = nums.length - 1 ;
        int seqSum = 0;
        while(sum>=seqSum){
            sum = sum - nums[i];
            seqSum = seqSum + nums[i];
            temp.add(nums[i]);
            i--;
        }
        return temp;
    }
}