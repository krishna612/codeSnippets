package trees;
//749,757
import java.util.ArrayList;

public class Epi99LinkedListFromLeavesOfBT {
	ArrayList<TreeNode> list;
	
	public ArrayList<TreeNode> getLeavesList(TreeNode root){
		list = new ArrayList<TreeNode>();
		addLeavesToList(root);
		return list;
	}
	
	private void addLeavesToList(TreeNode root){
	    if(root.getRight()==null && root.getLeft()==null){
	    	list.add(root);
	    }
	    if(root.getLeft()!=null)
	    	addLeavesToList(root.getLeft());
	    if(root.getRight()!=null)
	    	addLeavesToList(root.getRight());
	}

}
