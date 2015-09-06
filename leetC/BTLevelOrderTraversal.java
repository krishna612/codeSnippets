package leetcode;

import java.util.ArrayList;
import java.util.List;

import leetcode.BTValidateBST.TreeNode;
//running time 352ms
//1206 1222 142 228   16m+46m
public class BTLevelOrderTraversal {
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
        int level = 0,current=0,size=0;
        innerList.add(root);
        current++;
    	nodeList.add(innerList);
        
        List<TreeNode> itrList;
        while(innerList.size()>0){
        	itrList = nodeList.get(level);
        	innerList = new ArrayList<TreeNode>();
        	for(TreeNode itr1: itrList){
        		if(itr1!=null && itr1.left!=null){
        			innerList.add(itr1.left);
        			
        		}
        		if(itr1!=null && itr1.right!=null){
        			innerList.add(itr1.right);
        			
        		}
        	}
        	if(innerList.size()>0){
        		nodeList.add(innerList);
        		level++;
        	}
        	else
        		break;
        }
        for(List<TreeNode> outer: nodeList){
        	List<Integer> intList = new ArrayList<Integer>();
        	for(TreeNode inner: outer){
        		intList.add(inner.val);
        	}
        	list.add(intList);
        }
    	return list;   
    }

}
