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
        traverse(root,preorder_list);
        return preorder_list;
    }
    private void traverse(TreeNode root, List<Integer> preorder_list)
    {
        if(root==null)
            return;
        preorder_list.add(root.val);
        traverse(root.left,preorder_list);
        traverse(root.right,preorder_list);
    }
}