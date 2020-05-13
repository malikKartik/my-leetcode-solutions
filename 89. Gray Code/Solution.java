class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        if(n == 0){
            list.add(0);
            return list;
        }
        int len = (int)Math.pow(2,n);
        int[] arr = new int[len];
        int itrlen = 2;
        arr[0] = 0;
        arr[1] = 1;
        int itr = 1;
        while(itr<len-1){
            for(int i = 2*itrlen-1,j=0;i>itr;i--){
                arr[i] = itrlen + arr[j];
                j++;
            }
            itr = itr + itrlen;
            itrlen = itrlen*2;
        }
        for(int i = 0;i<arr.length;i++){
            list.add(arr[i]);
        }
        return list;
    }
}