class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int d = end - start;
        int max = 0;
        while(d>=1){
            max = Math.max(max,d*Math.min(height[start],height[end]));
            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;
            }
            d = end - start;
        }
        return max;
    }
}