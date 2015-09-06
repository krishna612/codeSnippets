package leetcode;

import leetcode.BTValidateBST.TreeNode;
//538 556 18m
//running time:304 ms
public class BTInvert {
	class TreeNode {
	     int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
    public TreeNode invertTree(TreeNode root) {
        if (root==null) return null;
        if (root.left==null && root.right==null) return root;
        TreeNode right,left;
        right = root.right;//this is imp to store right and left values, because we are going to change tree structure
        left = root.left;
        root.left = invertTree(right);
        root.right = invertTree(left);
    	return root;    
    }
}
