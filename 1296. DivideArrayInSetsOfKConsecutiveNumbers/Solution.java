class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.get(nums[i]) != null ? map.get(nums[i]) + 1 : 1);
        }
        while (!map.isEmpty()) {
            int firstKey = map.firstKey();

            for (int i = 0; i < k; i++) {

                int key = firstKey + i;

                if (!map.containsKey(key)) {
                    return false;
                } else {
                    map.put(key, map.get(key) - 1);

                    if (map.get(key) == 0)
                        map.remove(key);
                }
            }
        }
        return true;
    }
}