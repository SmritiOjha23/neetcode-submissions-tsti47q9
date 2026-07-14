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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> post_list=new ArrayList<>();
        helper(root,post_list);
        return post_list;
    }
    private void helper(TreeNode root, List<Integer> post_list)
    {
        if(root==null)
            return;
        helper(root.left,post_list);
        helper(root.right,post_list);
        post_list.add(root.val);
    }
}