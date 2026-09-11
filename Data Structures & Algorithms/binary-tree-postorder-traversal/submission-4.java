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
    List<Integer> postorder_list;
    public List<Integer> postorderTraversal(TreeNode root) {
        postorder_list=new ArrayList<>();
        traverse(root);
        return postorder_list;
    }
    private void traverse(TreeNode root)
    {
        if(root==null)
            return;
        traverse(root.left);
        traverse(root.right);
        postorder_list.add(root.val);
    }
}