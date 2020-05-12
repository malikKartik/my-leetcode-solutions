class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int close = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0;i<nums.length-2;i++){
            if(i==0 || i>0 && nums[i]!=nums[i-1]){
                int low = i+1;
                int high = nums.length-1;
                while(low<high){
                    if(nums[low]+nums[high]+nums[i]==target){
                        return target;
                    }else if(nums[low]+nums[high]+nums[i]>target){
                        if(Math.abs(nums[low]+nums[high]+nums[i]-target)<close){
                            close = Math.abs(nums[low]+nums[high]+nums[i]-target);
                            sum = nums[low]+nums[high]+nums[i];
                        }
                        high--;
                    }else{
                        if(Math.abs(nums[low]+nums[high]+nums[i]-target)<close){
                            close = Math.abs(nums[low]+nums[high]+nums[i]-target);
                            sum = nums[low]+nums[high]+nums[i];
                        }
                        low++;
                    }
                }
            }
        }
        return sum;
    }
}