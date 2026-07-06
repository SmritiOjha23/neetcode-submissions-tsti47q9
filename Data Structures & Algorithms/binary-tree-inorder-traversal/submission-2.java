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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder_list=new ArrayList<>();
        helper(root,inorder_list);
        return inorder_list;
    }
    public void helper(TreeNode root, List<Integer> inorder_list)
    {
        if(root==null)
            return;
        helper(root.left,inorder_list);
        inorder_list.add(root.val);
        helper(root.right,inorder_list);
    }
}