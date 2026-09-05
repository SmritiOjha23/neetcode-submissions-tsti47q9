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
        List<Integer> inorder_list=new ArrayList<Integer>();
        traverse(root,inorder_list);
        return inorder_list;
    }
    private void traverse(TreeNode root, List<Integer> inorder_list)
    {
        if(root==null)
            return;
        traverse(root.left,inorder_list);
        inorder_list.add(root.val);
        traverse(root.right,inorder_list);
    }
}