class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        return hasPathSumHelper(root,sum);
    }
    public boolean hasPathSumHelper(TreeNode root, int sum) {
        if(root == null){
            return (sum==0);
        }else{
            boolean ans = false;
            int subsum = sum - root.val;
            if(subsum==0 && root.left==null && root.right==null){
                return true;
            }
            if(root.left!=null){
                ans = ans || hasPathSum(root.left,subsum);
            }
            if(root.right!=null){
                ans = ans || hasPathSum(root.right,subsum);
            }
            return ans;
        }
        
    }
}