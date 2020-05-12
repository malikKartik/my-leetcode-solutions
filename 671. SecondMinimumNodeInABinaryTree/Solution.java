class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null)
            return -1;
        Stack<TreeNode> s = new Stack<>();
        TreeNode curr = root;
        while(curr != null|| s.size()>0){
            
            while(curr!=null){
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            list.add(curr.val);
            curr = curr.right;
        }
        List<Integer> temp = new ArrayList<>();
        Collections.sort(list);
        for(int i = 0;i<list.size();i++){
            if(i==0 || (i>0 && list.get(i)!=list.get(i-1))){
                temp.add(list.get(i));
            }
        }
        
        if(temp.size()>=2){
            return temp.get(1);
        }else return -1;
    }
}