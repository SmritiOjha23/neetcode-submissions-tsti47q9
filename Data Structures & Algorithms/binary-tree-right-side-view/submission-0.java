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
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null)
            return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=1;i<=size;i++)
            {
                TreeNode polled=q.poll();
                if(polled.left!=null)
                    q.offer(polled.left);
                if(polled.right!=null)
                    q.offer(polled.right);
                if(i==size)
                    ans.add(polled.val);
            }
        }
        return ans;
    }
}
