package leetcode;

import leetcode.BTValidateBST.TreeNode;

//https://leetcode.com/problems/balanced-binary-tree/
//a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1
//running time: 392ms
public class BTIsBalanced {
	class TreeNode {
	     int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        if(root.left==null && root.right==null) return true;
    	int heightDif;
        heightDif = depthOfTree(root.left)-depthOfTree(root.right);
        if(heightDif==0 || heightDif==1 || heightDif==-1){
        	return isBalanced(root.left) && isBalanced(root.right);
        }
        return false;
    }
    
    private int depthOfTree(TreeNode root){
    	if(root==null) return 0;
    	if(root.left==null && root.right==null) return 1;
    	int left = depthOfTree(root.left);
    	int right = depthOfTree(root.right);
    	return (left>right)?left+1:right+1;
    }
	
}
