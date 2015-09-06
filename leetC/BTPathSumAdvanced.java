package leetcode;

import java.util.ArrayList;
import java.util.List;

import leetcode.BTPathSum.TreeNode;
//257 320
public class BTPathSumAdvanced {
   class TreeNode {
	     int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	
   List<List<Integer>> list;
   List<Integer> privateList;
   
   public List<List<Integer>> pathSum(TreeNode root, int sum) {
       return list;
    }
   
   private List<List<Integer>> privatePathSum(TreeNode root, int sum, List<Integer> innerList){
	   if(root==null) return list;
       if(root.left==null && root.right==null && root.val ==sum){
    	   
       }
	   return list;
   }
}
