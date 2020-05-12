class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        int j = 1;
        if(root == null) return list;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            TreeNode curr = q.poll();
            j = j * -1;
            while(curr!=null){
                temp.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }if(curr.right!=null){
                    q.add(curr.right);
                }
                curr = q.poll();
            }
            if(curr==null){
                if(j==-1){
                    list.add(temp);
                }else{
                    Collections.reverse(temp);
                    list.add(temp);    
                }
                
                if(!q.isEmpty()){
                    q.add(null);
                }
            }
        }
        return list;
    }
}