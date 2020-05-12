class Solution {
    public boolean isUgly(int num) {
        int i2= 0,i3= 0,i5 = 0;
        List<Integer> list = new ArrayList();
        int next_2 = 2; 
        int next_3 = 3; 
        int next_5 = 5; 
        int next_ugly_no = 1;
        if(next_ugly_no == num) return true;
        if(num == 2147483647) return false;
        list.add(1);
        while(next_ugly_no < num){
            next_ugly_no = Math.min(next_2,Math.min(next_3,next_5));
            list.add(next_ugly_no);
            if(next_ugly_no == next_2){
                i2 = i2+1; 
                next_2 = list.get(i2)*2; 
            }
            if(next_ugly_no == next_3){
                i3 = i3+1; 
                next_3 = list.get(i3)*3;
            }
            if(next_ugly_no == next_5){
                i5 = i5+1; 
                next_5 = list.get(i5)*5;
            }
            if(next_ugly_no == num) return true;
        }
        return false;
    }
}