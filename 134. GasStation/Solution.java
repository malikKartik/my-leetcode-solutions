class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for(int i = 0;i<gas.length;i++){
            if(gas[i]>=cost[i]){
                System.out.println(i);
                int sum = 0;
                int flag = 0;
                for(int j = i;j<gas.length;j++){
                    if(j!=i && sum+gas[j]<cost[j]){
                        flag = -1;
                        break;
                    }
                    sum = sum + gas[j];
                    sum = sum - cost[j];
                }
                
                for(int j = 0;j<i;j++){
                    if(flag == -1) break;
                    if(j!=i && sum+gas[j]<cost[j]){
                        flag = -1;
                        break;
                    }
                    sum = sum + gas[j];
                    sum = sum - cost[j];
                }
                if(flag != -1) return i;
                System.out.println(flag);
            }
        }
        return -1;
    }
}