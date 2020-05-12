class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            List<Integer> temp = new ArrayList<>();
            while(curr!=null){
                temp.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                curr = q.poll();
            }
            if(curr == null){
                list.add(temp);
                if(!q.isEmpty()){
                    q.add(null);
                }
            }
        }
        return list;
    }
}