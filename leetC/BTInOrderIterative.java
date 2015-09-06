package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import leetcode.BTInOrderRecursive.TreeNode;
//603 700
//failing test [2,3,null,1]
public class BTInOrderIterative {

	class TreeNode {
	     int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	
	   List<Integer> list = new ArrayList<Integer>();
	   public List<Integer> inorderTraversal(TreeNode root) {
		   if(root==null) return list;
		   Stack<TreeNode> stack = new Stack<TreeNode>();
		   Stack<Boolean> isLeftTraversed = new Stack<Boolean>();
		   stack.push(root);
		   isLeftTraversed.push(false);
		   TreeNode ptr;
		   while(!stack.isEmpty()){
			   if(isLeftTraversed.peek()==false){
				   if(stack.peek().left!=null){
					 isLeftTraversed.pop();
					 isLeftTraversed.push(true);
					 stack.push(root.left);
				     isLeftTraversed.push(false);
				   }
				   else{
					 isLeftTraversed.pop();
				     isLeftTraversed.push(true);
				   }
			   }
			   else{
				   ptr = stack.pop();
				   isLeftTraversed.pop();
				   list.add(ptr.val);
				   if(ptr.right!=null){
					   stack.push(ptr.right);
					   isLeftTraversed.push(false);
				   }
			   }
		   }
		   return list;
	   }
	   
}
