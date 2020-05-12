class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        list.add(0);
        helper(root,sum,false,list);
        return list.get(0);
    }
    public static void helper(TreeNode root,int sum,boolean des,List<Integer> list){
        if(root.left == null && root.right == null){
            if(des == true ){
                sum = sum + root.val;
                list.set(0,list.get(0)+sum);
            }
            System.out.println(sum);
            return;
        }
        if(root.left!=null)
        helper(root.left,sum,true,list);
        if(root.right!=null)
        helper(root.right,sum,false,list);
    }
}