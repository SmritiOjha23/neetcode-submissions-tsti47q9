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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder_list=new ArrayList<>();
        helper(root,preorder_list);
        return preorder_list;
    }
    private void helper(TreeNode root, List<Integer> preorder_list)
    {
        if(root==null)
            return;
        preorder_list.add(root.val);
        helper(root.left,preorder_list);
        helper(root.right,preorder_list);
    }
}