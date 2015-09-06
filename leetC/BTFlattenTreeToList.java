package leetcode;

import leetcode.BTInOrderIterative.TreeNode;
//1140 1202
//750 815 600 640
public class BTFlattenTreeToList {
	class TreeNode {
	     int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	
	public void flatten(TreeNode root) {
		flattenPrivateOptimized(root);       
	}
	
	
	private TreeNode flattenPrivate(TreeNode root){
		if(root==null) return null;
		if(root.left==null && root.right==null) return root;
		if(root.left==null){
			root.right = flattenPrivate(root.right);
		}
		if(root.right==null){
			root.right = flattenPrivate(root.left);
		}
		TreeNode left = flattenPrivate(root.left);
		TreeNode last = left;
		while(last.right!=null) last = last.right;
		TreeNode tmpRight = root.right;
		root.right = left;
		last.right = tmpRight;
		tmpRight=null;left=null;last=null;
		return root;
	}
	
	private TreeNode flattenPrivateOptimized(TreeNode root){
		if(root==null) return null;
		if(root.left==null && root.right==null) return root;
		if(root.left==null){
			root.right = flattenPrivateOptimized(root.right);
			return root;
		}
		if(root.right==null){
			root.right =  flattenPrivateOptimized(root.left);
			return root;
		}
		TreeNode last = flattenPrivateOptimized(root.left);
		flattenPrivateOptimized(root.right);
		while(last.right!=null) last = last.right;
		last.right = root.right;
		root.right = root.left;
		return root;
	}

}
