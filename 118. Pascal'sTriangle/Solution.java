class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int line = 1;line<=numRows;line++){
            List<Integer> temp = new ArrayList<>();
            int el = 1;
            for(int i = 1;i<=line;i++){
                temp.add(el);
                el = el * (line - i)/i;
            }
            list.add(temp);
        }
        return list;
    }
}