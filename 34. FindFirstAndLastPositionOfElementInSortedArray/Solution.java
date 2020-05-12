class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = -1;
        int end = -1;
        int pos = Arrays.binarySearch(nums,target);
        System.out.println(pos);
        int i = pos;
        if(pos < 0){
            int arr[] = {-1,-1};
            return arr;
        }
        while(i< nums.length&&nums[pos] == nums[i]){
            end = i;
            i++;
        }
        i = pos;
        while(i>=0 &&nums[pos] == nums[i]){
            start = i;
            i--;
        }
        int arr[] = {start,end};
        return arr;
    }
}