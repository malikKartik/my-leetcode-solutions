class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int sum = 0;
        List<Integer> sumArr = new ArrayList<>();
        backtracker(candidates,0,target,list,sum,sumArr);
        return list;
    }
    public static void backtracker(int[] candidates,int start,int target,List<List<Integer>> list,int sum,List<Integer> sumArr){
        if(sum>target){
            return;
        }

        if(sum==target){
            list.add(new ArrayList<>(sumArr));
            return;
        }

        for(int i=start; i<candidates.length; i++){
            sumArr.add(candidates[i]);
            backtracker(candidates, i, target, list,sum+candidates[i], sumArr);
            sumArr.remove(sumArr.size()-1);
        }
    }
}