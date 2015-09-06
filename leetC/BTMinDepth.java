package leetcode;

import leetcode.BTInOrderIterative.TreeNode;
//1045 1055 1120 1135
//running time: 380ms
public class BTMinDepth {
	class TreeNode {
	     int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
    
	public int minDepth(TreeNode root) {
       if(root==null) return 0;
       if(root.left==null && root.right==null) return 1;
       int left,right,min;
       if(root.left!=null && root.right!=null){
    	   left = minDepth(root.left);
    	   right = minDepth(root.right);
    	   min = 0;
    	   if(left<right) min = left;
    	   else min = right;
    	   return min+1;
       }
       if(root.left==null){
    	   return minDepth(root.right)+1;
       }
       if(root.right==null){
    	   return minDepth(root.left)+1;
       }
       return 1;
    }
}
