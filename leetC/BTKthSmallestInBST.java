package leetcode;

//557 620 644 705
//single child nodes, deal with this case 
//720 740 (time: 444 ms, this time can be reduced further if we avoid counting nodes)
public class BTKthSmallestInBST {
	class TreeNode {
	     int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return root.val;
        //if(k==0) return root.val; 
        int count = noOfNodesUnderNode(root.left);
        if(count==k-1) return root.val; //deals with single child node case
        if(k<=count){
        	return kthSmallest(root.left,k);
        }
        else{
        	return kthSmallest(root.right,k-count-1);
        }
    }
    
    private int noOfNodesUnderNode(TreeNode root){
    	if(root==null) return 0;
    	if(root.left==null && root.right==null) return 1;
    	return noOfNodesUnderNode(root.left)+noOfNodesUnderNode(root.right)+1;
    }

}
