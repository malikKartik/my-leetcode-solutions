class Solution {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        double x = - Double.MAX_VALUE;
        TreeNode curr = root;
        while(curr!=null || !stack.isEmpty()){
            while(curr!=null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            if(curr.val<=x) return false;
            x = curr.val;
            curr = curr.right;
        }
        return true;
    }
}