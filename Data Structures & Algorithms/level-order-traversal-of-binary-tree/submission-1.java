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
        if(root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();

        q.offer(root);
        while(!q.isEmpty())
        {
            List<Integer> level=new ArrayList<>();
            int size=q.size();
            for(int i=1;i<=size;i++)
            {
                TreeNode del=q.poll();
                level.add(del.val);
                if(del.left!=null)
                    q.offer(del.left);
                if(del.right!=null)
                    q.offer(del.right);
            }
            ans.add(level);
        }
        
        return ans;
    }
}
