class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        Stack<TreeNode> stack1 = new Stack();
        Stack<TreeNode> stack2 = new Stack();
        stack1.push(q);
        stack2.push(p);
        if(p!=null&&q==null){
            return false;
        }
        if(p==null&&q!=null){
            return false;
        }
        while(p!=null && q!=null && !stack1.isEmpty()&&!stack2.isEmpty()){
            TreeNode temp1= stack1.pop();
            TreeNode temp2 = stack2.pop();
            if(temp1.val!=temp2.val) return false;
            if(temp1.right!=null && temp2.right != null){
                stack1.push(temp1.right);
                stack2.push(temp2.right);
            }else{
                if(temp1.right!=null && temp2.right==null){
                    return false;
                }
                if(temp1.right==null && temp2.right!=null){
                    return false;
                }
            }
           if(temp1.left!=null && temp2.left!=null){
                stack1.push(temp1.left);
               stack2.push(temp2.left);
           }else{
                if(temp1.left!=null && temp2.left==null){
                    return false;
                }
                if(temp1.left==null && temp2.left!=null){
                    return false;
                }
            }
        }
               return true;
    }
}