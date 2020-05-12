class Solution {
    public int divide(int dividend, int divisor) {
        int sign = ((dividend < 0) ^  
                   (divisor < 0)) ? -1 : 1; 
      
        // Update both divisor and 
        // dividend positive 
        dividend = Math.abs(dividend); 
        divisor = Math.abs(divisor); 
      
        // Initialize the quotient 
        int quotient = 0; 
          
        while (dividend >= divisor) 
        { 
            dividend -= divisor; 
            ++quotient; 
        } 
      
        return sign * quotient;
    }
}