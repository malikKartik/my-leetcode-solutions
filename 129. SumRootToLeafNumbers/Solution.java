class Solution {
    public int sumNumbers(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        if(root==null) return list.get(0);
        helper(root,0,list);
        return list.get(0);
    }
    public static void helper(TreeNode node,int sum,List<Integer> list){
        sum = sum*10 + node.val;
        if(node.left == null&&node.right==null){
            list.set(0,list.get(0)+sum);
            return;
        }
        if(node.left!=null){
            helper(node.left,sum,list);
        }
        if(node.right!=null){
            helper(node.right,sum,list);
        }
    }
}