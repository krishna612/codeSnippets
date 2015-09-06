package trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    private Queue<TreeNode> queue = new LinkedList<TreeNode>();
	
	public void printLevelOrder(TreeNode root){
	    if(root==null){
	    	System.out.println("empty tree: ");
	    	return;
	    }
		TreeNode tmp;
		queue.add(root);
	    while(!queue.isEmpty()){
		   tmp = queue.remove();
		   System.out.println(tmp.getDataNode().getData());
		   if(tmp.getLeft()!=null)
			   queue.add(tmp.getLeft());
		   if(tmp.getRight()!=null)
			   queue.add(tmp.getRight());
	   }
    }

}
