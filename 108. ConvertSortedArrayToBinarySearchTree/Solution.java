class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helperSortedArrayToBST(nums,0,nums.length-1);
    }
    public static TreeNode helperSortedArrayToBST(int arr[],int start,int end){
        if(start>end){
            return null;
        }
        
        int mid = (start+end)/2;
        TreeNode node = new TreeNode(arr[mid]);
        
        node.left = helperSortedArrayToBST(arr,start,mid - 1);
        node.right = helperSortedArrayToBST(arr,mid+1,end);
        
        return node;
    }
}