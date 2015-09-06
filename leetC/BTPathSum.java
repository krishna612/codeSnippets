package leetcode;

import leetcode.BTInvert.TreeNode;
//234 250
//running time:376ms
public class BTPathSum {
	class TreeNode {
	     int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)return false;
        if(root.left==null && root.right==null && sum==root.val) return true;//root to leaf path, so end node must be a leaf (reread the problem statement again)
        return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);
    }
}
