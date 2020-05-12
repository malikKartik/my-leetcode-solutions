class Solution {
    public int[] countBits(int num) {
        int arr[] = new int[num+1];
        if(num == 0) return arr;
        arr[0] = 0;
        arr[1] = 1;
        int point = 2;
        for(int i = 2;i<arr.length;i++){
            arr[i] = arr[i-point] + 1;
            // System.out.print(i-point+" ");
            if(i+1 == point * 2){
                point = i+1;
            }
        }
        return arr;
    }
}