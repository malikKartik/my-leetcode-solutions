class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        String s = "";
        List<String> list = new ArrayList<>();
        helper(root,list,s);
        return list;
    }
    public static void helper(TreeNode node,List<String> list,String s){
        if(node == null){
            return;
        }
        s = s + "->" + node.val;
        if(node.left == null && node.right == null){
            list.add(s.substring(2));
            return;
        }
        if(node.left!=null){
            helper(node.left,list,s);
        }
        if(node.right!=null){
            helper(node.right,list,s);
        }
    }
}