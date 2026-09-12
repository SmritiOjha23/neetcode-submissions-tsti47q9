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
    ArrayList<Integer> ans;
    public int kthSmallest(TreeNode root, int k) {
        ans=new ArrayList<>();
        traverse(root);
        return ans.get(k-1);
    }
    private void traverse(TreeNode root)
    {
        if(root==null)
            return;
        traverse(root.left);
        ans.add(root.val);
        traverse(root.right);
    }

}
