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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
            return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer> level=new ArrayList<>();
            for(int i=1;i<=size;i++)
            {
                TreeNode polled=q.poll();
                if(polled.left!=null)
                    q.offer(polled.left);
                if(polled.right!=null)
                    q.offer(polled.right);
                level.add(polled.val);
            }
            ans.add(level);
        }
        return ans;
    }
}
