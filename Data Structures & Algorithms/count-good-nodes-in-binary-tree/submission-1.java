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
    public int goodNodes(TreeNode root) {
        return count(root,Integer.MIN_VALUE);
    }
    public int count(TreeNode root, int max_so_far)
    {
        if(root==null) return 0;
        int count=0;
        if(root.val>=max_so_far)
        {
            max_so_far=root.val;
            count=1;
        }
        count+=count(root.left,max_so_far)+count(root.right,max_so_far);
        return count;
    }
}
