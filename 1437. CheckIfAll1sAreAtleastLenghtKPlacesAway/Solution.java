class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int count = 0;
        int i = 0;
        while(i<nums.length && nums[i]==0){
            i++;
        }
        int curr = i;
        int next = -1;
        for(i = i+1;i<nums.length;i++){
            while(i<nums.length && nums[i]==0){
                i++;
            }
            next = i;
            // System.out.println("next "+next+" curr "+curr);
            if(next<nums.length&&nums[next]==1 && next-curr-1<k) return false;
            next = -1;
            curr = i; 
        }
        return true;
    }
}