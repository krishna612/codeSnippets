package leetcode;

import java.util.ArrayList;
import java.util.List;
//1142 1149 7m
//running time: 260ms
import leetcode.BTValidateBST.TreeNode;

public class BTInOrderRecursive {
   class TreeNode {
	     int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
   List<Integer> list = new ArrayList<Integer>();
   public List<Integer> inorderTraversal(TreeNode root) {
       if(root==null) return list;
       if(root.left==null && root.right==null){
    	   list.add(root.val);
    	   return list;
       }
       inorderTraversal(root.left);
       list.add(root.val);
       inorderTraversal(root.right);
	   return list; 
    }

}
