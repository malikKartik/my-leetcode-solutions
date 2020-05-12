class Res { 
    public int val; 
} 
class Solution {
    public int maxPathSum(TreeNode root) {
        Res res = new Res(); 
        res.val = Integer.MIN_VALUE; 
  
        findMaxUtil(root, res); 
        return res.val; 
    }
    public int findMaxUtil(TreeNode node, Res res) 
    { 
  
        if (node == null) 
            return 0; 
  
         
        int l = findMaxUtil(node.left, res); 
        int r = findMaxUtil(node.right, res); 
  
         
        int max_single = Math.max(Math.max(l, r) + node.val, 
                                  node.val); 
  
  
         
        int max_top = Math.max(max_single, l + r + node.val); 
  
         
        res.val = Math.max(res.val, max_top); 
  
        return max_single; 
    } 
}