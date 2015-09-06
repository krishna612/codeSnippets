package leetcode;
//1107 1137 446 510 30m+24m
//breaking test: [10,5,15,null,null,6,20] level order traversal with null representing no nodes
//running time: 428ms
public class BTValidateBST {
	class TreeNode {
		     int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	 public boolean isValidBST(TreeNode root) {
		    if(root==null) return true;
	        if(root.left==null && root.right==null){
	        	return true;
	        }
	        TreeNode succesor=root,predecssor=root;
	        succesor = succesor.right;
	        predecssor = predecssor.left;
	        while(succesor!=null && succesor.left!=null){
	        	succesor = succesor.left;
	        }
	        while(predecssor!=null && predecssor.right!=null){
	        	predecssor = predecssor.right;
	        }
	        if(root.left==null && root.right!=null){
	        	if(root.val>=root.right.val || root.val>=succesor.val){
	        		return false;
	        	}
	        	return isValidBST(root.right);
	        }
	        if(root.left!=null && root.right==null){
	        	if(root.val<=root.left.val || root.val<=predecssor.val){
	        		return false;
	        	}
	        	return isValidBST(root.left);
	        }
	        if(root.val<root.right.val && root.val>root.left.val && root.val>predecssor.val && root.val<succesor.val)
	        	return isValidBST(root.left) && isValidBST(root.right);
	        return false;
	    }
}
