class Solution {
    public boolean lemonadeChange(int[] bills) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(5,0);
        map.put(10,0);
        map.put(20,0);
        for(int i = 0;i<bills.length;i++){
            if(bills[i]==5){
                map.put(5,map.get(5)+1);
            }
            if(bills[i]==10){
                int fives = map.get(5);
                if(fives>=1){
                    map.put(5,map.get(5)-1);
                    map.put(10,map.get(10)+1);
                }else{
                    return false;
                }
            }
            if(bills[i]==20){
                int fives = map.get(5);
                int tens = map.get(10);
                if(fives>=1 && tens >= 1){
                    map.put(5,map.get(5)-1);
                    map.put(10,map.get(10)-1);
                    map.put(20,map.get(20)+1);
                }else if(fives>=3){
                    map.put(5,map.get(5)-3);
                    map.put(20,map.get(20)+1);
                }else{
                    System.out.println(map.get(5));
                    System.out.println(map.get(10));
                    return false;
                }
            }
        }
        return true;
    }
}