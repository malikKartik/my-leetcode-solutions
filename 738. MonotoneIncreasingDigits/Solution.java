class Solution {
    public int monotoneIncreasingDigits(int N) {
        List<Integer> list = new ArrayList<>();
        while(N/10 != 0){
            list.add(N%10);
            N=N/10;
        }
        list.add(N%10);
        Collections.reverse(list);
        for(int i = 0;i<list.size();i++){
            if(i<list.size()-1 && list.get(i)>list.get(i+1)){
                list.set(i,list.get(i)-1);
                for(int j = i+1;j<list.size();j++){
                    list.set(j,9);
                }
                i = -1;
            }
        }
        int num = 0;
        for(int i = 0;i<list.size();i++){
            num = num*10 + list.get(i);
        }
        return num;
    }
}