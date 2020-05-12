class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return list;
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            int temp = 0;
            while(curr!=null){
                temp = curr.val;
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
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