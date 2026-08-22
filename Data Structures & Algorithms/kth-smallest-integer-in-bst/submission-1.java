/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    ArrayList<Integer> preorder_list=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        preorder(root);
        return preorder_list.get(k-1);
    }
    private void preorder(TreeNode root)
    {
        if(root==null)
            return;
        
        preorder(root.left);
        preorder_list.add(root.val);
        preorder(root.right);
    }
}
