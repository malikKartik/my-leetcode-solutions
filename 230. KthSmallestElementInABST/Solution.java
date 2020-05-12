class Solution {
    public static void inorder(TreeNode node,List<Integer> list){
        if(node == null) return;
        if(node.left != null) inorder(node.left,list);
        list.add(node.val);
        if(node.right !=null) inorder(node.right,list);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        System.out.println(list);
        return list.get(k-1);
    }
}