class Solution {
    public int countTriplets(int[] arr) {
        int n = arr.length;
        int ans = 0;
        int cum[] = new int[n+1];
        System.out.print(cum[0]+" ");
        for(int i = 1;i<=n;i++){
            cum[i] = cum[i-1] ^ arr[i-1];
            System.out.print(cum[i]+" ");
        }
        for(int i = 0;i<=n;i++){
            for(int k = i+2;k<=n;k++){
                if(cum[i]==cum[k]){
                    ans = ans + k - i - 1;
                }
            }
        }
        return ans;
    }
}