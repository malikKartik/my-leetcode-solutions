class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
         if (intervals.length < 2) {
            return 0;
        }
        Arrays.sort(intervals, new Comparator<int[]>() { 
            
          @Override
          public int compare(final int[] entry1,  
                             final int[] entry2) { 
   
            if (entry1[0] > entry2[0]) 
                return 1; 
            else
                return -1; 
          } 
        });
        int end = intervals[0][1];
        int min = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end) {
                end = Math.min(end, intervals[i][1]);
                min++;
            } else {
                end = intervals[i][1];
            }
        } 
        
        return min;
    }
}