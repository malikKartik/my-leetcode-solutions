class Solution {
    public void postorder(TreeNode node,List<Integer> list){
        if(node == null) return;
        if(node.left!=null) postorder(node.left,list);
        if(node.right!=null) postorder(node.right,list);
        list.add(node.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorder(root,list);
        return list;
    }
}