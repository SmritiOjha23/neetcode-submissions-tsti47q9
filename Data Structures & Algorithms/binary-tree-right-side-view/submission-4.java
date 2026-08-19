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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
            return ans;
        q.offer(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=1;i<=size;i++)
            {
                TreeNode polled=q.poll();
                if(i==size)
                    ans.add(polled.val);
                if(polled.left!=null)
                    q.offer(polled.left);
                if(polled.right!=null)
                    q.offer(polled.right);
            }
        }
        return ans;
    }
}
