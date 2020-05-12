class Solution {
    public Node connect(Node root) {
        if(root == null){
            return root;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            Node curr = q.poll();
            List<Node> temp = new ArrayList<>();
            while(curr!=null){
                temp.add(curr);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                curr = q.poll(); 
            }
            if(curr == null){
                for(int i = 0;i<temp.size()-1;i++){
                    Node pointer = temp.get(i);
                    Node toPointed = temp.get(i+1);
                    pointer.next = toPointed;
                }
                temp.get(temp.size()-1).next = null;
                if(!q.isEmpty()){
                    q.add(null);
                }
            }
        }
        return root;
    }
}