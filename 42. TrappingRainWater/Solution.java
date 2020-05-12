class Solution {
    public int trap(int[] height) {
        int left[] = new int[height.length];
        int right[] = new int[height.length];
        int max = 0;
        for(int i = 0;i<left.length;i++){
            max = Math.max(max,height[i]);
            left[i] = max-height[i];
        }
        max = 0;
        for(int i = right.length-1;i>=0;i--){
            max = Math.max(max,height[i]);
            right[i] = max-height[i];
        }
        int sum = 0;
        for(int i = 0;i<height.length;i++){
            sum = sum + Math.min(left[i],right[i]);
        }
        return sum;
    }
}