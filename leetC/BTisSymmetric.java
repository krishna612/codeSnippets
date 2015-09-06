package leetcode;

import leetcode.BTInvert.TreeNode;
//1233 1246
//running time: 328ms
public class BTisSymmetric {
	class TreeNode {
	     int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
  public boolean isSymmetric(TreeNode root) {
      if(root==null) return true;
      if(root.left==null && root.right==null) return true;
	  return findIfSymmetricTrees(root.left,root.right);      
    }
  
  private boolean findIfSymmetricTrees(TreeNode root1, TreeNode root2){
	  if(root1==null && root2==null) return true;
	  if(root1==null && root2!=null) return false;
	  if(root1!=null && root2==null) return false;
	  if(root1.val != root2.val) return false;
	  return (findIfSymmetricTrees(root1.left,root2.right) && findIfSymmetricTrees(root1.right,root2.left));
   }

}
