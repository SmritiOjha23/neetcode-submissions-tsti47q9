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
    int preIndex=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> inMap=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
            inMap.put(inorder[i],i);
        
        return solve(0,inorder.length-1, preorder, inMap);
    }
    public TreeNode solve(int inStart, int inEnd, int[] preorder, HashMap<Integer, Integer> inMap)
    {
        if(inStart>inEnd)
            return null;
        int rootVal=preorder[preIndex++];
        int index=inMap.get(rootVal);
        TreeNode root=new TreeNode(rootVal);
        root.left=solve(inStart, index-1, preorder, inMap);
        root.right=solve(index+1, inEnd, preorder, inMap);
        return root;

    }
}
