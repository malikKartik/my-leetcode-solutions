/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return list;
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            double sum = 0;
            double index = 0;
            TreeNode curr = q.poll();
            while(curr!=null){
                sum += curr.val;
                index++;
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
                curr = q.poll();
            }
            if(curr == null){
                list.add((double)sum/(double)index);
                if(!q.isEmpty()){
                    q.add(null);
                }
            }
        }
        return list;
    }
}