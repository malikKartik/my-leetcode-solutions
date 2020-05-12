class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        int num = cheeseSlices;
        int diff = tomatoSlices - 2 * num;
        List<Integer> sol = new ArrayList<>();
        if(num*2>tomatoSlices) return sol;
        if(diff < 0|| (diff!=0 && diff%2!=0) || diff > 2*num){
            return sol;
        }
        sol.add(diff/2);
        sol.add(num-diff/2);
        return sol;
    }
}