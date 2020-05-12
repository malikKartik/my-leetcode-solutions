class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length < 2)
        return;

        int red = 0;
        int blue = nums.length - 1;
        int i = 0;

        while (i < blue + 1)
            if (nums[i] == 0) {
                nums[i] = nums[red];
                nums[red++] = 0;
                i++;
            }
            else if (nums[i] == 2) {
                nums[i] = nums[blue];
                nums[blue--] = 2;
            }
            else i++;
    }
    
}