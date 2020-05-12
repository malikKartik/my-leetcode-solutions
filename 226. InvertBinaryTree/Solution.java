class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        return helperInvertTree(root);
    }
    public TreeNode helperInvertTree(TreeNode root){
        if(root==null || (root.left == null && root.right == null)){
            return root;
        }
        TreeNode temp= helperInvertTree(root.left);
        root.left = helperInvertTree(root.right);
        root.right = temp;
        return root;
    }
}