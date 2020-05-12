class Solution {
    public int depth(TreeNode node,List<Integer> flag){
        if(node == null){
            return 0;
        }
        int ldepth = depth(node.left,flag);
        int rdepth = depth(node.right,flag);
        if(Math.abs(ldepth-rdepth)>1){
            if(flag.size() <1)
            flag.add(-1);
        }
        if(ldepth>rdepth){
            return ldepth+1;
        }else{
            return rdepth+1;
        }

    }
    public boolean isBalanced(TreeNode root) {
        List<Integer> x= new ArrayList<>();
        depth(root,x);
        if(x.size()>0 && x.get(0)==-1){
            return false;
        }
        return true;
        
    }
}