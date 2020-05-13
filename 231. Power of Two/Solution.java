class Solution {
    public boolean isPowerOfTwo(int n) {
        long x = n;
        if(n == 0) return false;
        long temp = x & x-1;
        if(temp == 0) return true;
        else return false;
    }
}