package leetcode;

import java.util.ArrayList;
import java.util.List;

import leetcode.BTValidateBST.TreeNode;
//running time 328ms
//336 344 
public class BTLevelOrderTraversalV1 {
   class TreeNode {
	     int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
   List<List<Integer>> list = new ArrayList<List<Integer>>();
   List<List<TreeNode>> nodeList = new ArrayList<List<TreeNode>>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return list;
    	List<TreeNode> innerList = new ArrayList<TreeNode>();
    	List<Integer> innerDataList = new ArrayList<Integer>();
        int level = 0;
        innerList.add(root);
        innerDataList.add(root.val);
        nodeList.add(innerList);
        list.add(innerDataList);
        
        List<TreeNode> itrList;
        while(innerList.size()>0){
        	itrList = nodeList.get(level);
        	innerList = new ArrayList<TreeNode>();
        	innerDataList = new ArrayList<Integer>();
        	for(TreeNode itr1: itrList){
        		if(itr1!=null && itr1.left!=null){
        			innerList.add(itr1.left);
        			innerDataList.add(itr1.left.val);
        		}
        		if(itr1!=null && itr1.right!=null){
        			innerList.add(itr1.right);
        			innerDataList.add(itr1.right.val);
        		}
        	}
        	if(innerList.size()>0){
        		nodeList.add(innerList);
        		list.add(innerDataList);
        		level++;
        	}
        	else
        		break;
        }
        return list;   
    }

}
